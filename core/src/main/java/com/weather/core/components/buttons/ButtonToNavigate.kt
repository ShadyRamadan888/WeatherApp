package com.weather.core.components.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.weather.core.theme.TextButtonColor

@Composable
fun ButtonToNavigate(
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(
            text = text,
            color = TextButtonColor,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}