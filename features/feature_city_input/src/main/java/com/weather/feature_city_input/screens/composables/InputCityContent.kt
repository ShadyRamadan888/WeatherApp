package com.weather.feature_city_input.screens.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.weather.core.R
import com.weather.core.components.buttons.ButtonWithText
import com.weather.core.components.images.BackgroundImage
import com.weather.core.components.spacer.SpacerVertically_20
import com.weather.core.components.spacer.SpacerVertically_50
import com.weather.core.components.text_field.BasicOutlinedTextField
import com.weather.core.components.texts.LargTextWithLinesSpace
import com.weather.data.model.CityUiState

@Composable
fun InputCityContent(
    cityUiState: CityUiState,
    onCityNameChanged: (String) -> Unit,
    onClickButtonSearch: (String) -> Unit
) {

    var cityName = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BackgroundImage()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            SpacerVertically_50()

            LargTextWithLinesSpace(stringResource(R.string.Discover_text))

            SpacerVertically_20()

            BasicOutlinedTextField(
                value = cityUiState.name,
                placeHolderText = stringResource(R.string.search_placeholder),
                onDataChanged = onCityNameChanged
            )

            SpacerVertically_20()

            ButtonWithText(
                text = stringResource(R.string.search),
                onClickButtonSearch = onClickButtonSearch,
                cityName = cityUiState.name
            )
        }
    }
}