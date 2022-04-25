package com.satrio.sample_dagger.di

import android.content.Context
import com.satrio.sample_dagger.model.TestModel
import com.satrio.sample_dagger.usecase.Question
import com.satrio.sample_dagger.usecase.QuestionUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class QuestionOptionModule {
    @Binds
    abstract fun provideQuestionOption(question: QuestionUseCase): Question
}
