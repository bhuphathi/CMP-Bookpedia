package com.plcoding.bookpedia.book.presentation.book_detail

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_detail.components.BlurredImageBackground
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun BookDetailScreenRoot(
    viewModel: BookDetailViewModel = koinViewModel(),
    onBackClick: () -> Unit,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    BookDetailScreen(
        state = state,
        onAction = { action ->
            if (action is BookDetailAction.OnBackClick) {
                onBackClick()
            }
            viewModel.onAction(action)
        }
    )

}

@Composable
fun BookDetailScreen(
    modifier: Modifier = Modifier,
    state: BookDetailState,
    onAction: (BookDetailAction) -> Unit,
) {
    BlurredImageBackground(
        imageUrl = state.book?.imageUrl,
        isFavorite = state.isFavorite,
        onFavoriteClick = {
            onAction(BookDetailAction.OnFavoriteClick)
        },
        onBackClick = {
            onAction(BookDetailAction.OnBackClick)
        },
        modifier = Modifier.fillMaxSize()
    ) {
        BookDetailContent(
            book = state.book,
            modifier = modifier
        )
    }
}

@Composable
fun BookDetailContent(book: Book?, modifier: Modifier) {
    Text(book.toString())
}
