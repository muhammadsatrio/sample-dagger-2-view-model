package com.satrio.sample_dagger.usecase

import android.content.Context
import com.satrio.sample_dagger.model.QuestionOption
import com.satrio.sample_dagger.model.TestModel
import javax.inject.Inject

class QuestionUseCase @Inject constructor(testModel: TestModel) : Question {

    override fun getQuestionAndOption(): QuestionOption {
        return QuestionOption(
            question = getQuestion(),
            option = getOption()
        )
    }

    private fun getOption(): List<Pair<Boolean, String>> {
        val list = mutableListOf<Pair<Boolean, String>>()
        list.add(Pair(false, "first option"))
        list.add(Pair(false, "second option"))
        list.add(Pair(false, "third option"))
        list.add(Pair(true, "fouth option"))
        return list;
    }

    private fun getQuestion(): String {
        return "this is question"
    }
}

