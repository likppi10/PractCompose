package com.com.practcompose.basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class Preview : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MessageCard("Android")
            MessageCardPreviewHere("PreviewHere")
        }
    }
}

// 1. 미리보기 함수를 따로 선언하기
@Composable
fun MessageCardNotHere(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun PreviewNotHereMessageCard() {
    MessageCardNotHere("Preview_text")
}

// 2. 함수에 미리보기 설정을 포함한 채로 선언하기
@Preview
@Composable
fun MessageCardPreviewHere(@PreviewParameter(SampleUserProvider::class) name: String) {
    Text(text = "Hello $name!")
}

class SampleUserProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf("Preview_text")
}
