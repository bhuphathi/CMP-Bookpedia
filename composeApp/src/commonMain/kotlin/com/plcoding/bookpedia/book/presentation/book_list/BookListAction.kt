package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book

/**
 * [https://youtu.be/WT9-4DXUqsM?t=1888](https://youtu.be/WT9-4DXUqsM?t=1888)
 */
sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String): BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class OnTabSelected(val tabIndex: Int): BookListAction
}