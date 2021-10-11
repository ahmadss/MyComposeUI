package id.co.example.mycomposeui.widget

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import id.co.example.mycomposeui.R
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

@Composable
fun ImageDemo() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Load image from resource")
        Spacer(modifier = Modifier.padding(top = 16.dp))
        LoadFromResourceDemo()
        Spacer(modifier = Modifier.padding(top = 16.dp))
        Text(text = "Load image from url")
        Spacer(modifier = Modifier.padding(top = 16.dp))
        LoadFromUrlDemo()
    }
    
}

@Composable
fun LoadFromResourceDemo() {
    val image: Painter = painterResource(id = R.drawable.image)
    Image(painter = image, contentDescription = "Image")
}

@Composable
fun LoadFromUrlDemo() {


    val bitmap = remember {
        mutableStateOf<Bitmap?>(null)
    }

    val context = LocalContext.current
    Glide.with(context)
        .asBitmap()
        .load("https://rrtutors.com/uploads/langpostimg/download.jpg")
        .into(object : CustomTarget<Bitmap>(){
            override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                bitmap.value = resource
            }

            override fun onLoadCleared(placeholder: Drawable?) {
                TODO("Not yet implemented")
            }

        })

    val value = bitmap.value
    if(value!=null)
        Image(value.asImageBitmap(), contentDescription = "image", Modifier.fillMaxSize())
     else
         Text(text = "loading Image")
}


