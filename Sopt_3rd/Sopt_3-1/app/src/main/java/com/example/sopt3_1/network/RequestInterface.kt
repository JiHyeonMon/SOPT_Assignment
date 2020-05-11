package com.example.sopt3_1.network

import com.example.sopt3_1.data.RequestSignup
import com.example.sopt3_1.data.ResponseSignup
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface{


    @POST("/user/signup")
    fun requestSignup(@Body body: RequestSignup) : Call<ResponseSignup>


}
