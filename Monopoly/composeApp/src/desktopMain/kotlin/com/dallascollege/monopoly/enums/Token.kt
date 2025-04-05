package com.dallascollege.monopoly.enums

enum class Token {
    BOOT,
    DOG,
    CAR,
    IRON,
    TOPHAT,
    THIMBLE,
    WHEELBARREL,
    BATTLESHIP;

    override fun toString(): String {
        return name.replace("_", " ").lowercase().replaceFirstChar { it.uppercase() }
    }
}

fun convertTokenToImageStr(token: Token): String {
    return when (token) {
        Token.TOPHAT -> "TopHat"
        Token.BATTLESHIP -> "Battleship"
        Token.BOOT -> "Boot"
        Token.IRON -> "Iron"
        Token.THIMBLE -> "Thimble"
        Token.WHEELBARREL -> "WheelBarrow"
        Token.CAR -> "Car"
        Token.DOG -> "Dog"
    }
}