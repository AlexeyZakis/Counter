package com.example.counter.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Counter(
    modifier: Modifier = Modifier,
    counter: Int,
    topColor: Color = Color.Green,
    bottomColor: Color = Color.Red,
    onTopClick: () -> Unit,
    onBottomClick: () -> Unit,
) {
    Box(
        modifier = modifier
    ) {
        Column {
            ClickField(
                onClick = { onTopClick() },
                modifier = Modifier
                    .background(topColor)
                    .fillMaxSize()
                    .weight(1f)
            )
            ClickField(
                onClick = { onBottomClick() },
                modifier = Modifier
                    .background(bottomColor)
                    .fillMaxSize()
                    .weight(1f)
            )
        }
        CounterField(
            value = counter,
            modifier = Modifier
                .fillMaxSize(),
            textModifier = Modifier
                .background(Color.Gray, shape = RoundedCornerShape(8.dp))
                .padding(40.dp)

        )
    }
}

@Preview
@Composable
private fun CounterPreview() {
    Counter(
        counter = 0,
        topColor = Color(0xFF5276B7),
        bottomColor = Color(0xAA5276B7),
        onTopClick = {},
        onBottomClick = {},
    )
}
