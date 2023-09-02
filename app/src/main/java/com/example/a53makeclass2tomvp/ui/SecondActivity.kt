package com.example.a53makeclass2tomvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a53makeclass2tomvp.R
import com.example.a53makeclass2tomvp.ResultPresenter
import com.example.a53makeclass2tomvp.databinding.ActivitySecondBinding
import com.example.a53makeclass2tomvp.model.LoveModel
import com.example.a53makeclass2tomvp.view.ResultView

class SecondActivity : AppCompatActivity(),ResultView {
    private lateinit var binding:ActivitySecondBinding
    private val resultPresenter = ResultPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        val result = intent.getSerializableExtra("key") as LoveModel
        resultPresenter.getData(result)

        }


    override fun showLove(fname: String, sname: String, percentage: String, result: String) {
        with(binding){
            fnameTV.text = fname
            snameTV.text = sname
            percentageTV.text = percentage
            resultTV.text = result
    }
}
}