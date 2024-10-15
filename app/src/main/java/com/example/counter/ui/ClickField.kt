package com.example.counter.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ClickField(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .clickable(enabled = enabled) { onClick() }
    )
}

@Preview
@Composable
private fun ClickFieldPreview() {
    var counter by remember { mutableIntStateOf(0) }
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("$counter", fontSize = 40.sp, color = Color.Green)
    }
    ClickField(modifier = Modifier.fillMaxSize()) { ++counter }

}