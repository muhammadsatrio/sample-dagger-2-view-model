package com.satrio.sample_dagger.usecase

import com.satrio.sample_dagger.model.QuestionOption

interface Question {
    fun getQuestionAndOption(): QuestionOption
}