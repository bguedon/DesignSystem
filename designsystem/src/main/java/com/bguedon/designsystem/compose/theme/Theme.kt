package com.bguedon.devtest.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = androidx.compose.material.lightColors(
    primary = primaryColor,
    onPrimary = Color.White,
    secondary = Color.White,
    onSecondary = titleFontColor,
    background = Color.White,
    onBackground = titleFontColor
)

private val DarkColorPalette = androidx.compose.material.darkColors(
    primary = primaryColor,
    onPrimary = Color.White,
    secondary = secondaryDarkColor,
    onSecondary = Color.White,
    background = titleFontColor,
    onBackground = Color.White
)

@Composable
fun DevTestTheme(content: @Composable () -> Unit) {
    MaterialTheme(colors = if (isSystemInDarkTheme()) DarkColorPalette else LightColorPalette,
        typography = typography,
        content = content)
}