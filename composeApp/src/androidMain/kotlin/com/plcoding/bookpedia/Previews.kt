package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import io.ktor.client.engine.okhttp.OkHttp

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book Title $it",
        imageUrl = "http://test.com",
        authors = listOf("Author $it"),
        description = "Description $it",
        languages = listOf(),
        firstPublishYear = null,
        averageRating = 4.6784,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}

@Preview
@Composable
private fun BookSearchBarPreview() {
    MaterialTheme {
        Box(
            modifier = Modifier.background(color = Color.White)
        ) {
            BookListScreen(
                state = BookListState(searchResults = books),
                onAction = {  }
            )
        }
    }
}