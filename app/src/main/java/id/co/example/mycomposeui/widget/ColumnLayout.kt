package id.co.example.mycomposeui.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColumnLayoutDemo() {
    Row(modifier = Modifier.fillMaxSize()) {

        Column(content = {
            Text(text = "CTR")
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .width(50.dp)
                    .height(50.dp)
            )
        }, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight())

        Column(content = {
            Text(text = "SEV")
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .height(50.dp)
                    .width(50.dp)
            )
        }, verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxHeight())

        Column(content = {
            Text(text = "SBW")
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .width(50.dp)
                    .height(50.dp)
            )
        }, verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxHeight())

        Column(content = {
            Text(text = "SAR")
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .width(50.dp)
                    .height(50.dp)
            )
        }, verticalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxHeight())

        Column(content = {
            Text(text = "BTM")
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .width(50.dp)
                    .height(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .width(50.dp)
                    .height(50.dp)
            )
        }, verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxHeight())

        Column(content = {
            Text(text = "TOP")
            Box(modifier = Modifier
                .background(Color.Green)
                .width(50.dp)
                .height(50.dp))
            Box(modifier = Modifier
                .background(Color.Red)
                .width(50.dp)
                .height(50.dp))
            Box(modifier = Modifier
                .background(Color.Blue)
                .width(50.dp)
                .height(50.dp))
        }, verticalArrangement = Arrangement.Top, modifier = Modifier.fillMaxHeight())

    }
}