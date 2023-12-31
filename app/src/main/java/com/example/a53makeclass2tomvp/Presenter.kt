package com.example.a53makeclass2tomvp

import com.example.a53makeclass2tomvp.model.LoveModel
import com.example.a53makeclass2tomvp.model.RetrofitService
import com.example.a53makeclass2tomvp.view.LoveView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(val loveView: LoveView) {

    var api = RetrofitService.api
    //lateinit var loveView : LoveView

    fun getLoveResult(firstName: String, secondName: String) {
        api.calculateMatching(
            firstName,
            secondName
        ).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                response.body()?.let { model ->
                    loveView.navigationToResultScreen(model)

                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                loveView.showError(t.message.toString())
            }

        })

    }


}