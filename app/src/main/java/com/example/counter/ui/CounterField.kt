package com.example.counter.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterField(
    value: Int,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    textColor: Color = Color.Black,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Text(
            text = "$value",
            fontSize = 40.sp,
            color = textColor,
            textAlign = TextAlign.Center,
            modifier = textModifier
        )
    }
}

@Preview
@Composable
private fun CounterFieldPreview() {
    CounterField(
        value = 400,
        modifier = Modifier
            .background(Color.Gray.copy(alpha = 0.2f), shape = CircleShape)
            .padding(40.dp)
    )
}
