package id.co.example.mycomposeui.widget

import android.app.DatePickerDialog
import android.content.Context
import android.widget.DatePicker
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.*


@Composable
fun DatePickerDemo(context: Context) {
    val mYear: Int
    val mMount: Int
    val mDay: Int
    val now = Calendar.getInstance()

    mYear = now.get(Calendar.YEAR)
    mMount = now.get(Calendar.MONTH)
    mDay = now.get(Calendar.DAY_OF_MONTH)
    now.time = Date()

    val date = remember { mutableStateOf("") }

    val datepickerDialog =
        DatePickerDialog(
            context,
            { _: DatePicker, year: Int, month: Int, dayOfMonth: Int  ->
                val cal = Calendar.getInstance()
                cal.set(year, month, dayOfMonth)
                date.value = getFormattedDate(cal.time, "dd MMM,yyy")
            }, mYear, mMount, mDay)


    val day1= Calendar.getInstance()
    day1.set(Calendar.DAY_OF_MONTH, 1)
    datepickerDialog.datePicker.minDate = day1.timeInMillis
    datepickerDialog.datePicker.maxDate = Calendar.getInstance().timeInMillis
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            datepickerDialog.show()
        }) {
            Text(text = "Click To Open Date Picker")
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Selected date: ${date.value}")
    }
}

fun getFormattedDate(date: Date?, format: String): String {
    try {
        if (date != null) {
            val formatter = SimpleDateFormat(format, Locale.getDefault())
            return formatter.format(date)
        }
    } catch (e: Exception) {

    }
    return ""
}
