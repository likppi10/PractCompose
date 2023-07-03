package com.com.practcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Haa")
        }
    }
}

@Preview
@Composable
fun MessageCard(@PreviewParameter(SampleUserProvider::class) name: String) {
    Text(text = "Hello $name!")
}

class SampleUserProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf("HaHa")
}
