package com.dallascollege.monopoly.model

import com.dallascollege.monopoly.enums.ActionType
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ActionTest {
//Jenny
    @Test
    fun `action should correctly store its properties`() {
        val action = Action(
            name = "Purchase property",
            description = "Player purchases a property.",
            actionType = ActionType.PURCHASE_PROPERTY,
            propertyId = 12,
        )

        assertEquals("Purchase property", action.name)
        assertEquals("Player purchases a property.", action.description)
        assertEquals(ActionType.PURCHASE_PROPERTY, action.actionType)
        assertEquals(12, action.propertyId)
    }
//Jenny
    @Test
    fun `actionType toString should return correct text`() {
        val type = ActionType.BUY_HOUSE
        assertEquals("Buy house", type.toString())
    }
}
