package com.example.preview

import androidx.compose.ui.graphics.Color

fun parseColor(hex: String): Color {
    val sanitized = hex.removePrefix("#")
    val colorLong = sanitized.toLong(16)
    return if (sanitized.length == 6) {
        Color(0xFF000000 or colorLong)
    } else {
        Color(colorLong)
    }
}
