package com.example.counter.ui

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ClickerScreen() {
    val isLandscape = LocalConfiguration.current.orientation == ORIENTATION_LANDSCAPE
    val topColor1 = Color(0xfff55c48)
    val bottomColor1 = Color(0xfff56e58)
    val topColor2 = Color(0xff8fbbe8)
    val bottomColor2 = Color(0xbb8fbbe8)

    Scaffold(
        modifier =
            Modifier.fillMaxSize()
    ) { innerPadding ->
        if (isLandscape) {
            Row(
                modifier = Modifier
                    .padding(innerPadding)
            ) {
                Counter(
                    topColor = topColor1,
                    bottomColor = bottomColor1,
                    modifier = Modifier
                        .weight(1f)
                )
                Counter(
                    topColor = topColor2,
                    bottomColor = bottomColor2,
                    modifier = Modifier
                        .weight(1f)
                )
            }
        } else {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
            ) {
                Counter(
                    topColor = topColor1,
                    bottomColor = bottomColor1,
                    modifier = Modifier
                        .weight(1f)
                )
                Counter(
                    topColor = topColor2,
                    bottomColor = bottomColor2,
                    modifier = Modifier
                        .weight(1f)
                )
            }
        }
    }
}

@Preview(
    widthDp = 400,
    heightDp = 800
)
@Composable
private fun ClickerScreenPortraitPreview() {
    ClickerScreen()
}

@Preview(
    widthDp = 800,
    heightDp = 400
)
@Composable
private fun ClickerScreenLandscapePreview() {
    ClickerScreen()
}