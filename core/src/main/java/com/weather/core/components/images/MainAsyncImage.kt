package com.weather.core.components.images

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun MainAsyncImage(
    modifier: Modifier,
    model: Any?
) {
    AsyncImage(
        model = model,
        contentDescription = null,
        modifier = modifier
    )
}