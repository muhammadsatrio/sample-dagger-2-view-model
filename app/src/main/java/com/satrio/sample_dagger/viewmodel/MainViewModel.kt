package com.satrio.sample_dagger.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.satrio.sample_dagger.model.QuestionOption
import com.satrio.sample_dagger.usecase.QuestionUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val question: QuestionUseCase
) : ViewModel() {
    private val testLiveData = MutableLiveData<String>()

    private var couter = 0
    private lateinit var dataFromActivity: String
    fun increase() {
        couter++
        testLiveData.value = couter.toString()
    }

    fun setData(data: String) {
        this.dataFromActivity = data
    }

    fun setDataToLiveData(data: String) {
//        testLiveData.value = data
    }

    fun getLiveData() = testLiveData

    fun getQuestionOption() {
        val questionOption = question.getQuestionAndOption()
        testLiveData.value = questionOption.question
    }
}
