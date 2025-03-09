package com.dallascollege.monopoly.model

class MonopolyGame(
    val players: List<Player>,
    val properties: List<Property>
) {
    fun movePlayer(player: Player, steps: Int) {
        player.position = (player.position + steps) % properties.size
        val property = properties[player.position]
        handlePropertyLanding(player, property)
    }

    private fun handlePropertyLanding(player: Player, property: Property) {
        if (property.owner == null) {
            offerPurchase(player, property)
        } else if (property.owner != player) {
            collectRent(player, property)
        }
    }

    private fun offerPurchase(player: Player, property: Property) {
        if (player.balance >= property.price) {
            // Here you can add logic to ask the player if they want to buy the property
            player.balance -= property.price
            property.owner = player
            println("${player.name} bought ${property.name}!")
        } else {
            println("${player.name} does not have enough money to buy ${property.name}.")
        }
    }

    private fun collectRent(player: Player, property: Property) {
        val rent = property.price / 10 // Example rent calculation
        player.balance -= rent
        property.owner?.balance = property.owner?.balance?.plus(rent) ?: 0
        println("${player.name} paid $rent to ${property.owner?.name} for landing on ${property.name}.")
    }
}
