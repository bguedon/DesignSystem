package com.bguedon.devtest.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val primaryColor = Color(0xFF589442)
val secondaryDarkColor = Color(0xFF303030)
val titleFontColor = Color(0xFF121212)
val borderStrokeColorLight = Color(0xFFD5D8DC)
val borderStrokeColorDark = Color(0xFF303030)
val dividerColorLight = Color(0xFFE8E8E8)
val dividerColorDark = Color(0xFF2B2B2B)

val Colors.borderStroke: Color
    get() = if (isLight) borderStrokeColorLight else borderStrokeColorDark

val Colors.divider: Color
    get() = if (isLight) dividerColorLight else dividerColorDark
