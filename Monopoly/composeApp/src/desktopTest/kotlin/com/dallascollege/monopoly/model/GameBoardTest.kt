package com.dallascollege.monopoly.model

import com.dallascollege.monopoly.enums.PropertyColor
import com.dallascollege.monopoly.enums.Token
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GameBoardTest {

    private lateinit var gameBoard: GameBoard

    @BeforeEach
    fun setUp() {
        val players = arrayOf(
            Player(
                id = 1,
                name = "Player1",
                token = Token.TOPHAT
            ),
            Player(
                id = 2,
                name = "Player2",
                token =  Token.BOOT
            )
        )
        val turnOrder = arrayOf(1, 2)

        gameBoard = GameBoard(
            players = players,
            turnOrder = turnOrder,
            currentTurn = 1,
            selectedPlayerId = 1,
            centralMoney = 0,
            speedDieMode = false,
            freeParkingRule = false,
        )

        gameBoard.createModels()
    }
    //Jenny
    @Test
    fun `getPlayerById should return the correct player`() {
        val player = gameBoard.getPlayerById(1)
        assertEquals("Player1", player?.name)

        val nonExistentPlayer = gameBoard.getPlayerById(999)
        assertEquals(null, nonExistentPlayer)
    }
    //Jenny
    @Test
    fun `getPropertyById should return the correct property`() {
        val property = Property(id = 1, name = "San Diego Drive", price = 60, color = PropertyColor.BROWN)
        gameBoard.properties = arrayOf(property)

        val fetchedProperty = gameBoard.getPropertyById(1)
        assertEquals("San Diego Drive", fetchedProperty?.name)

        val nonExistentProperty = gameBoard.getPropertyById(999)
        assertEquals(null, nonExistentProperty)
    }
// JENNY
    @Test
    fun `getCellById should return the correct cell`() {
        val cell = Cell(numCell = 1, isCollectSalary = true)
        gameBoard.cells = arrayOf(cell)

        val fetchedCell = gameBoard.getCellById(1)
        assertEquals(1, fetchedCell?.numCell)

        val nonExistentCell = gameBoard.getCellById(999)
        assertEquals(null, nonExistentCell)
    }
//Jenny
    @Test
    fun `createModels should initialize both cells and properties`() {
        gameBoard.cells = emptyArray()
        gameBoard.properties = emptyArray()
        gameBoard.createModels()

        assertEquals(40, gameBoard.cells.size)
        assertEquals(28, gameBoard.properties.size)
    }
// Jenny
    @Test
    fun `getPropertyOwner should return correct player for owned property`() {
        val property = Property(id = 1, name = "San Diego Drive", price = 60, color = PropertyColor.BROWN)
        gameBoard.properties = arrayOf(property)

        val player = gameBoard.getPlayerById(1)
        player?.propertyIds = mutableListOf(1)

        val owner = gameBoard.getPropertyOwner(property)
        assertEquals("Player1", owner?.name)
    }

}
