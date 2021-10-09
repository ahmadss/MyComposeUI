package id.co.example.mycomposeui.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/*fun RowLayoutDemo() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(" "Arrangement Centre"")
        Spacer(modifier = Modifier.padding(8.dp))

        Row(content = {
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Black)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .height(50.dp)
                    .width(50.dp)
            )
        }, horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding(8.dp))
        Text(" Arrangement SpaceEvenly")
        Spacer(modifier = Modifier.padding(8.dp))
        Row(content = {
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Black)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .height(50.dp)
                    .width(50.dp)
            )
        }, horizontalArrangement = Arrangement.SpaceEvenly,modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding(8.dp))
        Text(" Arrangement SpaceBetween")
        Spacer(modifier = Modifier.padding(8.dp))
        Row(content = {
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Black)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .height(50.dp)
                    .width(50.dp)
            )
        }, horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding(8.dp))
        Text(" Arrangement SpaceAround")
        Spacer(modifier = Modifier.padding(8.dp))
        Row(content = {
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Black)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .height(50.dp)
                    .width(50.dp)
            )
        }, horizontalArrangement = Arrangement.SpaceAround,modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding(8.dp))
        Text(" Arrangement End")
        Spacer(modifier = Modifier.padding(8.dp))
        Row(content = {
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Black)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .height(50.dp)
                    .width(50.dp)
            )
        }, horizontalArrangement = Arrangement.End,modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding(8.dp))
        Text(" Arrangement Start")
        Spacer(modifier = Modifier.padding(8.dp))
        Row(content = {
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Black)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .height(50.dp)
                    .width(50.dp)
            )
        }, horizontalArrangement = Arrangement.Start,modifier = Modifier.fillMaxWidth())

    }
}*/
@Composable
fun RowLayoutDemo() {
    Column(Modifier.fillMaxSize()) {
        Text(text = " Arrangement Centre ")
        Spacer(modifier = Modifier.padding(8.dp))
        Row(content = {
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .height(50.dp)
                    .width(50.dp)
            )
            Box(modifier = Modifier
                .background(Color.Red)
                .height(50.dp)
                .width(50.dp))
            Box(modifier = Modifier
                .background(Color.Blue)
                .height(50.dp)
                .width(50.dp))
        }, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = " Arrangement SpaceEvenly ")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(content = {
            Box(modifier = Modifier
                .background(Color.Green)
                .height(50.dp)
                .width(50.dp))
            Box(modifier = Modifier
                .background(Color.Red)
                .height(50.dp)
                .width(50.dp))
            Box(modifier = Modifier
                .background(Color.Blue)
                .height(50.dp)
                .width(50.dp))
        }, horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = " Arrangement SpaceBetween")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(content = {
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
        }, horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = " Arrangement SpaceAround")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(content = {
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
        }, horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = " Arrangement End")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(content = {
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
        }, horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = " Arrangement Start")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(content = {
            Box(modifier = Modifier.background(Color.Green).width(50.dp).height(50.dp))
            Box(modifier = Modifier.background(Color.Red).width(50.dp).height(50.dp))
            Box(modifier = Modifier.background(Color.Blue).width(50.dp).height(50.dp))
        }, horizontalArrangement = Arrangement.Start, modifier = Modifier.fillMaxWidth());
    }
}

@Preview
@Composable
fun RowLayoutDemoPrev() {

}