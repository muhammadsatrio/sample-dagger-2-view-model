package com.satrio.sample_dagger

import android.app.Application
import com.satrio.sample_dagger.di.AppComponent
import com.satrio.sample_dagger.di.DaggerAppComponent

class QuizApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}