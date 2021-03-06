package id.co.example.mycomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import id.co.example.mycomposeui.ui.theme.MyComposeUITheme
import id.co.example.mycomposeui.widget.*

class MainActivity : ComponentActivity() {
//    val customerViewModel by viewModels<Cu>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    //Toast
//                    ToastDemo();

                    //RowLayout
//                    RowLayoutDemo()

                    //ColumnLayout
//                    ColumnLayoutDemo()

                    //TextField
//                    TextFieldDemo()

//                    Theme
//                    ThemeDem()

                    //Text
//                    TextDemo()

                    //Alert Dialog
//                    AlertDialogDemo()

                    //ButtonWidhtAndHeight
//                    ButtonDemo()

                    //Datepicker
//                    DatePickerDemo(context = this@MainActivity)

                    //card
//                    CardDemo()

                    //CheckBoc
//                    CheckBoxDemo()

                    // floating menu
//                    FloatingActionMenu()

//Image
//                    ImageDemo()
                    
                    //image transparancy
                    //imageTransparancyDemo()

                    //CircularImage
//                    CircularImageViewDemo()

//                    CircularProgress
                    CircularProgressBarDemo()

                    //Rdio Button
//                    RadioButtonDemo()
                    //Thema Demo
//                    ThemeDemo()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeUITheme {
//        ToastDemo()
    }
}