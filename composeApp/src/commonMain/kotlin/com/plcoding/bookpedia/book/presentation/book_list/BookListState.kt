package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
)

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
