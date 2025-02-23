package com.plcoding.bookpedia.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

/**
 * [https://youtu.be/WT9-4DXUqsM?t=10636](https://youtu.be/WT9-4DXUqsM?t=10636)
 */
fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(sharedModules, platformModule)
    }
}