package id.co.example.mycomposeui.widget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle


@Composable
fun AlertDialogDemo() {
    val openDialog = remember {
        mutableStateOf(true)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { openDialog.value = true }) {
            Text(text = "Open Alert Dialog")
        }

        if (openDialog.value) {
            AlertDialog(
                onDismissRequest = { openDialog.value = false },
                title = {
                    Text(text = "Alert Dialog", fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                },
                confirmButton = {
                    TextButton(onClick = { openDialog.value = false }) {
                        Text("Yes",style = androidx.compose.ui.text.TextStyle(color = Color.White))

                    }
                },
                dismissButton = {
                    TextButton(onClick = { openDialog.value = false}) {
                        Text(text = "No", style = androidx.compose.ui.text.TextStyle(Color.White))
                    }
                },

                backgroundColor = Color.Blue,
                contentColor = Color.White
            )
        }
    }
}