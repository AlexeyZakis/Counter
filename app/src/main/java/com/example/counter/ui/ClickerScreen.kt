package com.example.counter.ui

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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

    var counter1 by rememberSaveable { mutableIntStateOf(0) }
    var counter2 by rememberSaveable { mutableIntStateOf(0) }

    Box(
        modifier =
            Modifier.fillMaxSize()
    ) {
        AdaptiveScreen(isLandscape = isLandscape,
            content1 = {
                Counter(
                    counter = counter1,
                    topColor = topColor1,
                    bottomColor = bottomColor1,
                    onTopClick = { ++counter1 },
                    onBottomClick = { --counter1 },
                    modifier = it,
                )
           },
            content2 = {
                Counter(
                    counter = counter2,
                    topColor = topColor2,
                    bottomColor = bottomColor2,
                    onTopClick = { ++counter2 },
                    onBottomClick = { --counter2 },
                    modifier = it,
                )
            }
        )
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
