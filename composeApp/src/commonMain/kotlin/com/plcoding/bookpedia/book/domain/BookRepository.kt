package com.plcoding.bookpedia.book.domain

import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result

/**
 * [https://youtu.be/WT9-4DXUqsM?t=8625](https://youtu.be/WT9-4DXUqsM?t=8625)
 * [https://youtu.be/WT9-4DXUqsM?t=8682](https://youtu.be/WT9-4DXUqsM?t=8682)
 */
interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}