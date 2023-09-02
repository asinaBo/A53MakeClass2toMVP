package com.example.a53makeclass2tomvp.view

import com.example.a53makeclass2tomvp.model.LoveModel

interface LoveView {
    fun navigationToResultScreen(loveModel: LoveModel)
    fun showError(error: String)

}