package com.plcoding.bookpedia.book.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchedBookDto (
    @SerialName("key") val id: String,
    @SerialName("title") val title: String,
    @SerialName("language") val languages: List<String>?,
    @SerialName("cover_i") val coverAlternativeKey: Int?,
    @SerialName("author_key") val authorKeys: List<String>?,
    @SerialName("author_name") val authorNames: List<String>?,
    @SerialName("cover_edition_key") val coverKey: Int?,
    @SerialName("first_publish_year") val firstPublishYear: Int?,
    @SerialName("ratings_average") val ratingsAverage: Double?,
    @SerialName("ratings_count") val ratingsCount: Int?,
    @SerialName("number_of_pages_median") val numPagesMedian: Int?,
    @SerialName("edition_count") val numEditions: Int?,
)