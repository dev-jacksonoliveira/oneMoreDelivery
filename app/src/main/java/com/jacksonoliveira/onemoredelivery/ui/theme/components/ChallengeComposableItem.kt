package com.jacksonoliveira.onemoredelivery.ui.theme.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jacksonoliveira.onemoredelivery.R
import com.jacksonoliveira.onemoredelivery.ui.theme.Purple500
import com.jacksonoliveira.onemoredelivery.ui.theme.Purple80

@Preview(showBackground = true)
@Composable
fun ItemKit() {
    Surface(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        shadowElevation = 4.dp
    ) {
        Row(
            Modifier
                .height(height = 200.dp)
                .fillMaxWidth()
        ) {
            val imageSize = 100.dp
            val boxModifier =
                Modifier
                    .background(Brush.verticalGradient(colors = listOf(Purple500, Purple80)))
                    .width(imageSize)
                    .fillMaxHeight()
            Box(modifier = boxModifier) {
                val borderWidth = 2.dp
                val imageModifier = Modifier
                    .size(imageSize)
                    .offset(x = imageSize / 2)
                    .align(Alignment.Center)
                    .clip(CircleShape)
                    .border(
                        BorderStroke(
                            borderWidth,
                            Brush.verticalGradient(colors = listOf(Purple80, Purple500))
                        ),
                        CircleShape
                    )
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = imageModifier
                )
            }
            Spacer(modifier = Modifier.width(imageSize / 2))
            Box(
                Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .padding(16.dp)
                    .align(CenterVertically)
            ) {
                Column {
                    Text(
                        text = LoremIpsum(50).values.first(),
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = 20.sp
                    )
                }
            }
        }
    }
}