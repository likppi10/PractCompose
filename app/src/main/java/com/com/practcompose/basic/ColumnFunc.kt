package com.com.practcompose.basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ColumnFunc : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCards(Message("Android", "Jetpack Compose"))
        }
    }
}

data class Message(val author: String, val body: String)

// @Composable
// fun MessageCards(msg: Message) {
//    Text(text = msg.author)
//    Text(text = msg.body)
// }

@Preview
@Composable
fun PreviewMessageCards() {
    MessageCards(
        msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
    )
}

// Column 함수로 텍스트를 Vertical 하게 정렬할 수 있다.
// Row 함수로는 Horizontal 하게 정렬할 수 있다.
@Composable
fun MessageCards(msg: Message) {
    Row {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}
