package com.jacksonoliveira.onemoredelivery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ChallengeComposable() {
    Row(Modifier.height(90.dp)) {
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .width(70.dp)
                .fillMaxHeight()
        )
        Column(
            Modifier
                .background(Color.Gray)
        ) {
            Row(
                Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Test 1")
            }
            Row(
                Modifier
                    .background(Color.LightGray)
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(8.dp)
            ) {
                Text(text = "Test 2")
            }
        }
    }
}