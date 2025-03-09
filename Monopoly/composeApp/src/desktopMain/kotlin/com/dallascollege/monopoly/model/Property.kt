package com.dallascollege.monopoly.model

data class Property(
    val name: String,
    val price: Int,
    var owner: Player? = null


)

