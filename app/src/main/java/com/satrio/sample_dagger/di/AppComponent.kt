package com.satrio.sample_dagger.di

import android.content.Context
import com.satrio.sample_dagger.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [QuestionOptionModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
}
