package com.satrio.sample_dagger.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.satrio.sample_dagger.QuizApplication
import com.satrio.sample_dagger.databinding.ActivityMainBinding
import com.satrio.sample_dagger.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as QuizApplication).appComponent.inject(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.setData("halooo")
        viewModel.setDataToLiveData("from activity")
        viewModel.increase()
        observeModel()
        initView()
    }

    private fun initView() {
        viewModel.getQuestionOption()
    }

    private fun observeModel() {
        viewModel.getLiveData().observe(this) {
            binding.btnTest.text = it
        }
    }
}
