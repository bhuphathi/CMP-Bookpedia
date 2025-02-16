package com.plcoding.bookpedia

import BookSearchBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun BookSearchBarPreview() {
    MaterialTheme {
        Box(
            modifier = Modifier.background(color = Color.White)
        ) {
            App()
        }
    }
}