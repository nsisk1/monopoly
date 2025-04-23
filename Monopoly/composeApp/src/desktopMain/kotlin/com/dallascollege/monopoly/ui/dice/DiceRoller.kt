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
fun DiceRoller(gameBoard: GameBoard, currentTurn: MutableState<Int>) {
    val dice = remember { Dice() }
    var dice1 by remember { mutableStateOf(1) }
    var dice2 by remember { mutableStateOf(1) }
    var hasRolled by remember { mutableStateOf(false) }

    // Reset roll availability on turn change
    LaunchedEffect(currentTurn.value) {
        hasRolled = false
    }

    fun rollDice() {
        dice1 = dice.roll()
        dice2 = dice.roll()

        val total = dice1 + dice2
        val currentPlayerId = gameBoard.turnOrder[currentTurn.value]

        GameEngine.movePlayer(gameBoard, currentPlayerId, total)
        GameEngine.landingAction(gameBoard, currentPlayerId)

        gameBoard.selectedPlayerId = currentPlayerId
        hasRolled = true
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