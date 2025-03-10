package com.dallascollege.monopoly.model

data class Property(
    val name: String,
    val price: Int,
    val colorGroup: String, // Added color group
    val rent: List<Int>, // Rent amounts based on houses/hotels
    val houseCost: Int, // Cost to build a house
    val hotelCost: Int, // Cost to build a hotel
    var owner: Player? = null,
    var houses: Int = 0, // Number of houses built
    var hotel: Boolean = false // Whether a hotel is built
) {
    fun calculateRent(): Int {
        return when {
            hotel -> rent[5] // Rent with hotel
            houses > 0 -> rent[houses] // Rent with houses
            else -> rent[0] // Base rent
        }
    }
}


fun createMonopolyProperties(): List<Property> {
    return listOf(
        // Brown Properties
        Property("Mediterranean Avenue", 60, "Brown", listOf(2, 10, 30, 90, 160, 250), 50, 50),
        Property("Baltic Avenue", 60, "Brown", listOf(4, 20, 60, 180, 320, 450), 50, 50),

        // Light Blue Properties
        Property("Oriental Avenue", 100, "Light Blue", listOf(6, 30, 90, 270, 400, 550), 50, 50),
        Property("Vermont Avenue", 100, "Light Blue", listOf(6, 30, 90, 270, 400, 550), 50, 50),
        Property("Connecticut Avenue", 120, "Light Blue", listOf(8, 40, 100, 300, 450, 600), 50, 50),

        // Pink Properties
        Property("St. Charles Place", 140, "Pink", listOf(10, 50, 150, 450, 625, 750), 100, 100),
        Property("States Avenue", 140, "Pink", listOf(10, 50, 150, 450, 625, 750), 100, 100),
        Property("Virginia Avenue", 160, "Pink", listOf(12, 60, 180, 500, 700, 900), 100, 100),

        // Orange Properties
        Property("St. James Place", 180, "Orange", listOf(14, 70, 200, 550, 750, 950), 100, 100),
        Property("Tennessee Avenue", 180, "Orange", listOf(14, 70, 200, 550, 750, 950), 100, 100),
        Property("New York Avenue", 200, "Orange", listOf(16, 80, 220, 600, 800, 1000), 100, 100),

        // Red Properties
        Property("Kentucky Avenue", 220, "Red", listOf(18, 90, 250, 700, 875, 1050), 150, 150),
        Property("Indiana Avenue", 220, "Red", listOf(18, 90, 250, 700, 875, 1050), 150, 150),
        Property("Illinois Avenue", 240, "Red", listOf(20, 100, 300, 750, 925, 1100), 150, 150),

        // Yellow Properties
        Property("Atlantic Avenue", 260, "Yellow", listOf(22, 110, 330, 800, 975, 1150), 150, 150),
        Property("Ventnor Avenue", 260, "Yellow", listOf(22, 110, 330, 800, 975, 1150), 150, 150),
        Property("Marvin Gardens", 280, "Yellow", listOf(24, 120, 360, 850, 1025, 1200), 150, 150),

        // Green Properties
        Property("Pacific Avenue", 300, "Green", listOf(26, 130, 390, 900, 1100, 1275), 200, 200),
        Property("North Carolina Avenue", 300, "Green", listOf(26, 130, 390, 900, 1100, 1275), 200, 200),
        Property("Pennsylvania Avenue", 320, "Green", listOf(28, 150, 450, 1000, 1200, 1400), 200, 200),

        // Dark Blue Properties
        Property("Park Place", 350, "Dark Blue", listOf(35, 175, 500, 1100, 1300, 1500), 200, 200),
        Property("Boardwalk", 400, "Dark Blue", listOf(50, 200, 600, 1400, 1700, 2000), 200, 200),

        // Railroads
        Property("Reading Railroad", 200, "Railroad", listOf(25, 50, 100, 200), 0, 0),
        Property("Pennsylvania Railroad", 200, "Railroad", listOf(25, 50, 100, 200), 0, 0),
        Property("B. & O. Railroad", 200, "Railroad", listOf(25, 50, 100, 200), 0, 0),
        Property("Short Line", 200, "Railroad", listOf(25, 50, 100, 200), 0, 0),

        // Utilities
        Property("Electric Company", 150, "Utility", listOf(0), 0, 0),
        Property("Water Works", 150, "Utility", listOf(0), 0, 0)
    )
}
