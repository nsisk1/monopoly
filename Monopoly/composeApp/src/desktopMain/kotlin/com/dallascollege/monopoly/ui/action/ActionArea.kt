package com.dallascollege.monopoly.ui.action

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dallascollege.monopoly.model.GameBoard

@Composable
fun ActionArea(gameBoard: GameBoard, playerId: Int, currentTurn: MutableState<Int>, selectedPlayerId: MutableState<Int>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .border(2.dp, Color.Black, RoundedCornerShape(4.dp))
            .background(Color.White)
    ) {
        ActionView(gameBoard, playerId, currentTurn, selectedPlayerId)
    }
}