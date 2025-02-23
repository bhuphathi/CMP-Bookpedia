package com.plcoding.bookpedia

import android.app.Application
import com.plcoding.bookpedia.di.initKoin
import org.koin.android.ext.koin.androidContext

/**
 * [https://youtu.be/WT9-4DXUqsM?t=10712](https://youtu.be/WT9-4DXUqsM?t=10712)
 * Called when the application is starting, before any activity, service, or receiver objects (excluding content providers) have been created.
 */
class BookApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            // must be registered in AndroidManifest.xml as <application android:name=".BookApplication">
            // this is to supply the android context to Koin
            androidContext(this@BookApplication)
        }

    }
}