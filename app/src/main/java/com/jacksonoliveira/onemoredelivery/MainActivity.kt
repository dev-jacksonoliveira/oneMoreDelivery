package com.jacksonoliveira.onemoredelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jacksonoliveira.onemoredelivery.ui.theme.OneMoreDeliveryTheme
import com.jacksonoliveira.onemoredelivery.ui.theme.Purple500
import com.jacksonoliveira.onemoredelivery.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneMoreDeliveryTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    ProductsSection()
                }
            }
        }
    }
}

@Composable
fun ProductsSection() {
    Column {
        val textModifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp)
        Text(text = "Promoções", modifier = textModifier, fontSize = 20.sp, fontWeight = FontWeight(400))

        val rowModifier = Modifier
            .padding(top = 8.dp, bottom = 16.dp)
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
        Row(modifier = rowModifier, horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Spacer(Modifier)
            ProductItem()
            ProductItem()
            ProductItem()
            Spacer(Modifier)
        }
    }
}

@Composable
fun ProductItem() {
    OneMoreDeliveryTheme {
        Surface(
            shape = RoundedCornerShape(15.dp),
            shadowElevation = 4.dp
        ) {
            Column(
                Modifier
                    .background(Color.White)
                    .width(200.dp)
                    .heightIn(250.dp, 300.dp)
            ) {
                val imageSize = 100.dp
                Box(
                    modifier = Modifier
                        .height(imageSize)
                        .background(Brush.horizontalGradient(colors = listOf(Purple500, Teal200)))
                        .fillMaxWidth()
                ) {
                    val imageModifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(BottomCenter)

                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        modifier = imageModifier,

                        )
                }
                Spacer(modifier = Modifier.height(imageSize / 2))
                Column(Modifier.padding(16.dp)) {
                    Text(
                        text = LoremIpsum(50).values.first(),
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "R$14,99",
                        modifier = Modifier.padding(top = 8.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductsSectionPreview() {
    ProductsSection()
}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem()
}