package com.example.a53makeclass2tomvp

import com.example.a53makeclass2tomvp.model.LoveModel
import com.example.a53makeclass2tomvp.view.ResultView

class ResultPresenter (private val resultView: ResultView){

    fun getData(loveModel: LoveModel){
        resultView.showLove(loveModel.firstName,loveModel.secondName,loveModel.percentage,loveModel.result)

    }

}