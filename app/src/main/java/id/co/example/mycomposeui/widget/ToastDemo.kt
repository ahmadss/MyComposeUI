package id.co.example.mycomposeui.widget

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext


@Composable
fun ToastDemo() {
    val context = LocalContext.current
    Column(
        content = {
            Button(
                onClick = { Toast.makeText(context, "Show Toast....", Toast.LENGTH_LONG).show() },
                content = {
                    Text(
                        text = "Show Toast"
                    )
                })

        },
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
}