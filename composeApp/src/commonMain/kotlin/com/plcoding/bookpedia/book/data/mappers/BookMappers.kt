package com.plcoding.bookpedia.book.data.mappers

import com.plcoding.bookpedia.book.data.dto.SearchedBookDto
import com.plcoding.bookpedia.book.domain.Book

/**
 * [https://youtu.be/WT9-4DXUqsM?t=8369](https://youtu.be/WT9-4DXUqsM?t=8369)
 * [https://youtu.be/WT9-4DXUqsM?t=8397](https://youtu.be/WT9-4DXUqsM?t=8397)
 * data model to domain model
 */
fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imageUrl = if(coverKey != null) {
            "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
        } else {
            "https://covers.openlibrary.org/b/id/${coverAlternativeKey}-L.jpg"
        },
        authors = authorNames ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        firstPublishYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions ?: 0
    )
}