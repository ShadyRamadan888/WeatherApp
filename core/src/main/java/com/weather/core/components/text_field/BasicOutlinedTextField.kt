package com.weather.core.components.text_field

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BasicOutlinedTextField(
    onDataChanged: (String) -> Unit,
    value: String,
    placeHolderText: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = onDataChanged,
        placeholder = {
            Text(
                text = placeHolderText,
                color = Color.White,
                fontSize = 14.sp,
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .size(51.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.White,
            unfocusedTextColor = Color.White,
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color.White,
        )
    )
}