package com.bguedon.designsystem.compose.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.bguedon.devtest.ui.theme.DevTestTheme
import com.bguedon.devtest.ui.theme.divider


@Composable
fun VerticalSeparator(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
) {
    Box(modifier = modifier
        .fillMaxHeight()
        .width(thickness)
        .background(MaterialTheme.colors.divider))
}

@Preview(name = "Light")
@Preview(name = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun previewVerticalSeparator() {
    DevTestTheme {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)) {
            VerticalSeparator(modifier = Modifier.align(Alignment.Center))
        }
    }
}