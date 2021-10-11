package id.co.example.mycomposeui.widget

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@Composable
fun CardDemo() {
    Column(modifier = Modifier.fillMaxSize()) {

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            content = { Text(text = "Text dengan argument", modifier = Modifier.padding(16.dp)) })

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            content = {
                Text(
                    text = "Content dengan shape argument",
                    modifier = Modifier.padding(16.dp)
                )
            })

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), backgroundColor = Color.Gray,
            content = {
                Text(
                    text = "card dengan background argument",
                    modifier = Modifier.padding(16.dp)
                )
            })

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), elevation = 10.dp,
            content = {
                Text(
                    text = "Card dengan argument elevation Argument",
                    modifier = Modifier.padding(16.dp)
                )
            })

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            border = BorderStroke(2.dp, Color.Black),
            content = {
                Text(
                    text = "Card dengan argument Border Stroke",
                    modifier = Modifier.padding(16.dp)
                )
            }
        )

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), contentColor = Color.Green, content = {
            Text(text = "Card dengan argument Content Color", modifier = Modifier.padding(16.dp))
        })
    }
}