package com.weather.core.components.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun LargTextWithLinesSpace(
    text: String,
    lineHeight: TextUnit = 40.sp,
    fontSize: TextUnit = 40.sp,
    color: Color = Color.White
) {
    Text(
        text = text,
        fontSize = fontSize,
        color = color,
        maxLines = 3,
        fontWeight = FontWeight.Bold,
        lineHeight = lineHeight
    )
}