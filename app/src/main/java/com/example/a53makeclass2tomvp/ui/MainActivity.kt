package com.example.a53makeclass2tomvp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a53makeclass2tomvp.Presenter
import com.example.a53makeclass2tomvp.R
import com.example.a53makeclass2tomvp.changeScreen
import com.example.a53makeclass2tomvp.databinding.ActivityMainBinding
import com.example.a53makeclass2tomvp.model.LoveModel
import com.example.a53makeclass2tomvp.view.LoveView

class MainActivity : AppCompatActivity(), LoveView {
    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            calculateBtn.setOnClickListener {
                presenter.getLoveResult(firstEd.text.toString(), secondEd.text.toString())
            }
        }
    }

    override fun navigationToResultScreen(loveModel: LoveModel) {
        changeScreen(SecondActivity(), loveModel)

    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}