package com.weather.core.components.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.weather.core.theme.TextButtonColor

@Composable
fun RegularText(
    text: String,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = TextButtonColor,
    fontSize: TextUnit
) {
    Text(
        text = text,
        color = color,
        fontWeight = fontWeight,
        fontSize = fontSize
    )
}