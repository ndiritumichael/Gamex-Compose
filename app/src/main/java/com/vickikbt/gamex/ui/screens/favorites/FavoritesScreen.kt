package com.vickikbt.gamex.ui.screens.favorites

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FavoritesScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Favorites Screen")
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    FavoritesScreen()
}