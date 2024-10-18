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
    content1: @Composable (modifier: Modifier) -> Unit,
    content2: @Composable (modifier: Modifier) -> Unit,
) {
    if (isLandscape) {
        Row(modifier) {
            content1(Modifier.weight(1f))
            content2(Modifier.weight(1f))
        }
    } else {
        Column(modifier) {
            content1(Modifier.weight(1f))
            content2(Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AdaptiveScreenLandscapePreview() {
    AdaptiveScreen(
        isLandscape = false,
        content1 = {
            Box(Modifier.size(40.dp).background(Color.Green.copy(alpha = 0.5f)))
        },
        content2 = {
            Box(Modifier.size(40.dp).background(Color.Blue.copy(alpha = 0.5f)))
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun AdaptiveScreenPortraitPreview() {
    AdaptiveScreen(
        isLandscape = true,
        content1 = {
            Box(Modifier.size(40.dp).background(Color.Green.copy(alpha = 0.5f)))
        },
        content2 = {
            Box(Modifier.size(40.dp).background(Color.Blue.copy(alpha = 0.5f)))
        }
    )
}
