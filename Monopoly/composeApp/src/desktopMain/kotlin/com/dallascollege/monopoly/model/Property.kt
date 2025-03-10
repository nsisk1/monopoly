package com.dallascollege.monopoly.model

data class Property(
    val name: String,
    val price: Int, // Purchase price
    val rent: Int, // Base rent
    val rentWithHouses: List<Int>, // Rent with 1, 2, 3, 4 houses
    val rentWithHotel: Int, // Rent with a hotel
    val houseCost: Int, // Cost to build one house
    val hotelCost: Int, // Cost to build a hotel (requires 4 houses)
    var owner: Player? = null
)


package com.dallascollege.monopoly.model

fun createMonopolyProperties(): List<Property> {
    return listOf(
        // Brown Properties
        Property("Mediterranean Avenue", 60, 2, listOf(10, 30, 90, 160), 250, 50, 50),
        Property("Baltic Avenue", 60, 4, listOf(20, 60, 180, 320), 450, 50, 50),

        // Light Blue Properties
        Property("Oriental Avenue", 100, 6, listOf(30, 90, 270, 400), 550, 50, 50),
        Property("Vermont Avenue", 100, 6, listOf(30, 90, 270, 400), 550, 50, 50),
        Property("Connecticut Avenue", 120, 8, listOf(40, 100, 300, 450), 600, 50, 50),

        // Pink Properties
        Property("St. Charles Place", 140, 10, listOf(50, 150, 450, 625), 750, 100, 100),
        Property("States Avenue", 140, 10, listOf(50, 150, 450, 625), 750, 100, 100),
        Property("Virginia Avenue", 160, 12, listOf(60, 180, 500, 700), 900, 100, 100),

        // Orange Properties
        Property("St. James Place", 180, 14, listOf(70, 200, 550, 750), 950, 100, 100),
        Property("Tennessee Avenue", 180, 14, listOf(70, 200, 550, 750), 950, 100, 100),
        Property("New York Avenue", 200, 16, listOf(80, 220, 600, 800), 1000, 100, 100),

        // Red Properties
        Property("Kentucky Avenue", 220, 18, listOf(90, 250, 700, 875), 1050, 150, 150),
        Property("Indiana Avenue", 220, 18, listOf(90, 250, 700, 875), 1050, 150, 150),
        Property("Illinois Avenue", 240, 20, listOf(100, 300, 750, 925), 1100, 150, 150),

        // Yellow Properties
        Property("Atlantic Avenue", 260, 22, listOf(110, 330, 800, 975), 1150, 150, 150),
        Property("Ventnor Avenue", 260, 22, listOf(110, 330, 800, 975), 1150, 150, 150),
        Property("Marvin Gardens", 280, 24, listOf(120, 360, 850, 1025), 1200, 150, 150),

        // Green Properties
        Property("Pacific Avenue", 300, 26, listOf(130, 390, 900, 1100), 1275, 200, 200),
        Property("North Carolina Avenue", 300, 26, listOf(130, 390, 900, 1100), 1275, 200, 200),
        Property("Pennsylvania Avenue", 320, 28, listOf(150, 450, 1000, 1200), 1400, 200, 200),

        // Dark Blue Properties
        Property("Park Place", 350, 35, listOf(175, 500, 1100, 1300), 1500, 200, 200),
        Property("Boardwalk", 400, 50, listOf(200, 600, 1400, 1700), 2000, 200, 200),

        // Railroads
        Property("Reading Railroad", 200, 25, emptyList(), 0, 0, 0),
        Property("Pennsylvania Railroad", 200, 25, emptyList(), 0, 0, 0),
        Property("B. & O. Railroad", 200, 25, emptyList(), 0, 0, 0),
        Property("Short Line", 200, 25, emptyList(), 0, 0, 0),

        // Utilities
        Property("Electric Company", 150, 0, emptyList(), 0, 0, 0),
        Property("Water Works", 150, 0, emptyList(), 0, 0, 0)
    )
}


