package com.dallascollege.monopoly.model

import com.dallascollege.monopoly.enums.PropertyColor

class GameBoard(
    players: Array<Player>,
    turnOrder: Array<Int> = emptyArray(),
    currentTurn: Int = 0,
    selectedPlayerId: Int = 1,
    centralMoney: Int = 0,
    speedDieMode: Boolean = false,
    freeParkingRule: Boolean = false,
    cells: Array<Cell> = emptyArray(),
    properties: Array<Property> = emptyArray()
) {

    private fun createCells() {
        val cells = arrayOf<Cell>()
        val cellList = cells.toMutableList()
        var numCell = 1

        cellList.add(
            Cell(
                numCell = numCell,
                isCollectSalary = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 1,
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isCommunityChest = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 2
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isIncomeTax = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 3
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 4
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isChance = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 5
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 6
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isVisitingJail = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 7
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 8
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 9
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 10
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 11
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 12
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isCommunityChest = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 13
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 14
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isParking = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 15
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isChance = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 16
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 17
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 18
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 19
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 20
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 21
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 22
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isGoToJail = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 23
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 24
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isCommunityChest = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 25
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 26
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isChance = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 27
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                isLuxuryTax = true
            )
        )
        numCell++
        cellList.add(
            Cell(
                numCell = numCell,
                propertyId = 28
            )
        )

        this.cells = cellList.toTypedArray()
    }

    private fun createProperties() {
        val properties = arrayOf<Property>()
        val propertyList = properties.toMutableList()
        var id = 1

        propertyList.add(
            Property(
                id = id,
                name = "San Diego Drive",
                price = 60,
                color = PropertyColor.BROWN
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Kansas Drive",
                price = 90,
                color = PropertyColor.BROWN
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Beverly RailRoad",
                price = 200,
                isUtility = true,
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Vermont Drive",
                price = 120,
                color = PropertyColor.LIGHT_BLUE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Phoenix Drive",
                price = 130,
                color = PropertyColor.LIGHT_BLUE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Boston Drive",
                price = 150,
                color = PropertyColor.LIGHT_BLUE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Olivia Gardens",
                price = 140,
                color = PropertyColor.PINK
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Car Company",
                price = 150,
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "California Drive",
                price = 160,
                color = PropertyColor.PINK
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "States drive",
                price = 140,
                color = PropertyColor.PINK
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Manhattan Railroad",
                price = 200,
                isUtility = true
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Bethany Drive",
                price = 180,
                color = PropertyColor.ORANGE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "New York Drive",
                price = 20,
                color = PropertyColor.ORANGE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Atlanta Drive",
                price = 200,
                color = PropertyColor.ORANGE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Almond Drive",
                price = 200,
                color = PropertyColor.RED
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Clement Drive",
                price = 200,
                color = PropertyColor.RED
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Pacific Drive",
                price = 260,
                color = PropertyColor.RED
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Water Works",
                price = 60,
                isUtility = true
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Rodeo Drive",
                price = 260,
                color = PropertyColor.YELLOW
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Nashville Drive",
                price = 260,
                color = PropertyColor.YELLOW
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Railroad",
                price = 200,
                isRailRoad = true
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Oakville",
                price = 230,
                color = PropertyColor.YELLOW
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Atlantic Drive",
                price = 300,
                color = PropertyColor.GREEN
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Clement Drive", //change name because is duplicated in RED property color
                price = 300,
                color = PropertyColor.GREEN
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Riverside",
                price = 250,
                color = PropertyColor.GREEN
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Short line",
                price = 200,
                color = PropertyColor.WHITE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Folklore Heights",
                price = 200,
                color = PropertyColor.BLUE
            )
        )
        id++
        propertyList.add(
            Property(
                id = id,
                name = "Salt Lake",
                price = 350,
                color = PropertyColor.BLUE
            )
        )

        this.properties = propertyList.toTypedArray()
    }

    fun createModels() {
        createProperties()
        createCells()
    }

    var players: Array<Player> = players
        get() = field
        set(value) {
            field = value
        }

    var turnOrder: Array<Int> = turnOrder
        get() = field
        set(value) {
            field = value
        }

    var currentTurn: Int = currentTurn
        get() = field
        set(value) {
            field = value
        }

    var selectedPlayerId: Int = selectedPlayerId
        get() = field
        set(value) {
            field = value
        }

    var centralMoney: Int = centralMoney
        get() = field
        set(value) {
            field = value
        }

    var speedDieMode: Boolean = speedDieMode
        get() = field
        set(value) {
            field = value
        }

    var freeParkingRule: Boolean = freeParkingRule
        get() = field
        set(value) {
            field = value
        }

    var cells: Array<Cell> = cells
        get() = field
        set(value) {
            field = value
        }

    var properties: Array<Property> = properties
        get() = field
        set(value) {
            field = value
        }
}

