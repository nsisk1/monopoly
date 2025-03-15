package com.dallascollege.monopoly.logic

import com.dallascollege.monopoly.model.*

class GameEngine(gameBoard: GameBoard, action: Action, playerId: Int) {

    private val board = gameBoard // Use the passed gameBoard
    private val players = listOf(
        Player(id = "Battleship"),
        Player("Top hat")
    )
    private var currentPlayerIndex = 0

    fun rollDice(): Int {
        return (1..6).random() + (1..6).random() // Return the sum of two dice rolls
    }

    fun nextTurn() {
        val player = players[currentPlayerIndex]
        val diceRoll = rollDice()
        println("${player.name} rolled a $diceRoll!")
        player.move(diceRoll, board)

        // Move to the next player
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size
    }
}
