package com.example.sopt_3_2.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RequestSignupToServer{
    var retrofit = Retrofit.Builder()
        .baseUrl("http://13.209.144.115:3333")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: RequestSignupInterface = retrofit.create(RequestSignupInterface::class.java)
}