package id.co.example.mycomposeui.widget

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CheckBoxDemo() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Unchecked Checkbox")
        Spacer(modifier = Modifier.padding(8.dp))
        Row{
            val isChecked = remember {
                mutableStateOf(false)
            }
            Checkbox(checked = isChecked.value, onCheckedChange = {isChecked.value = it},)
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = "A")
            
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Checked CheckBox")
        Spacer(modifier = Modifier.size(8.dp))
        Row{
            val isChecked = remember {
                mutableStateOf(true)
            }
            Checkbox(checked = isChecked.value, onCheckedChange = {isChecked.value = it})
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = "B")
        }

        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Color Checkbox")
        Spacer(modifier = Modifier.size(8.dp))
        Row{
            val isChecked = remember {
                mutableStateOf(true)
            }
            Checkbox(checked = isChecked.value, onCheckedChange = {isChecked.value = it}, colors = androidx.compose.material.CheckboxDefaults.colors(
                Color.Red
            ))
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = "Color")
        }

        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Group Checkbox")
        Spacer(modifier = Modifier.size(8.dp))
        val fruitsList = arrayListOf<String>("Apple", "Mangga", "Jeruk")
        fruitsList.forEach { option: String ->
            Spacer(modifier = Modifier.size(16.dp))
            Row {
                val isChecked = remember { mutableStateOf(false) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(option)
            }
        }

    }
}