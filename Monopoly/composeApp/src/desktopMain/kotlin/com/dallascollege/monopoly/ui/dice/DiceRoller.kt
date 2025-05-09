package com.dallascollege.monopoly.ui.dice

import androidx.compose.foundation.layout.*
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.dallascollege.monopoly.logic.GameEngine
import com.dallascollege.monopoly.model.Dice
import com.dallascollege.monopoly.model.GameBoard

@Composable
@Preview
fun DiceRoller(gameBoard: GameBoard, currentTurn: MutableState<Int>, message: MutableState<String>) {
    val dice = remember { Dice() }
    var dice1 by remember { mutableStateOf(1) }
    var dice2 by remember { mutableStateOf(1) }
    var hasRolled by remember { mutableStateOf(false) }
    var shouldEndTurn by remember { mutableStateOf(false) }

    // Reset roll availability on turn change
    LaunchedEffect(currentTurn.value) {
        hasRolled = false
        shouldEndTurn = false
    }

    // Triggered when player rolls three doubles and must end turn
    LaunchedEffect(shouldEndTurn) {
        if (shouldEndTurn) {
            GameEngine.finishTurn(gameBoard, currentTurn, message)
        }
    }

    fun rollDice() {
        dice1 = dice.roll()
        dice2 = dice.roll()

        val total = dice1 + dice2
        val currentPlayerId = gameBoard.turnOrder[currentTurn.value]
        val player = gameBoard.getPlayerById(currentPlayerId) ?: return

        // Track doubles for jail logic
        if (dice1 == dice2) {
            player.consecutiveDoubles += 1
        } else {
            player.consecutiveDoubles = 0
        }

        // Jail after 3 doubles
        if (player.consecutiveDoubles == 3) {
            player.consecutiveDoubles = 0
            message.value = "${player.name} rolled three doubles! Go to jail."
            GameEngine.goToJail(player)
            hasRolled = true
            shouldEndTurn = true
            return
        }

        GameEngine.movePlayer(gameBoard, currentPlayerId, total)
        GameEngine.landingAction(gameBoard, currentPlayerId, message)

        gameBoard.selectedPlayerId = currentPlayerId
        hasRolled = dice1 != dice2 // if doubles, player can roll again

        if (dice1 == dice2) {
            message.value = "${player.name} rolled doubles! Roll again!"
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DiceView(dice1)
            DiceView(dice2)
            Button(onClick = { rollDice() }, enabled = !hasRolled) {
                Text("Roll the dice")
            }
        }
    }
}
