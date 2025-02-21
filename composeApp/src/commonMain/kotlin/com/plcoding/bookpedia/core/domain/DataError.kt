package com.plcoding.bookpedia.core.domain

/**
 * [https://youtu.be/WT9-4DXUqsM?t=7329](https://youtu.be/WT9-4DXUqsM?t=7329)
 */
sealed interface DataError: Error {
    enum class Remote: DataError {
        REQUEST_TIMEOUT,
        TOO_MANY_REQUESTS,
        NO_INTERNET,
        SERVER,
        SERIALIZATION,
        UNKNOWN
    }

    enum class Local: DataError {
        DISK_FULL,
        UNKNOWN
    }
}