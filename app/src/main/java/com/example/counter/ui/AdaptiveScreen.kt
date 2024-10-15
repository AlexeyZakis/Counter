package com.example.counter.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AdaptiveScreen(
    isLandscape: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    if (isLandscape) {
        Row(modifier) {
            content()
        }
    } else {
        Column(modifier) {
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AdaptiveScreenLandscapePreview() {
    AdaptiveScreen(
        isLandscape = false
    ) {
        Box(Modifier.size(40.dp).background(Color.Green.copy(alpha = 0.5f)))
        Box(Modifier.size(40.dp).background(Color.Blue.copy(alpha = 0.5f)))
    }
}

@Preview(showBackground = true)
@Composable
private fun AdaptiveScreenPortraitPreview() {
    AdaptiveScreen(
        isLandscape = true
    ) {
        Box(Modifier.size(40.dp).background(Color.Green.copy(alpha = 0.5f)))
        Box(Modifier.size(40.dp).background(Color.Blue.copy(alpha = 0.5f)))
    }
}