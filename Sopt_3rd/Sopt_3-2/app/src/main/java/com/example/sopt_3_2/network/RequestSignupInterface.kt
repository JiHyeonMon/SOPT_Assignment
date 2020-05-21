package com.example.sopt_3_2.network

import com.example.sopt_3_2.data.RequestSignup
import com.example.sopt_3_2.data.ResponseSignup
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestSignupInterface {
    @POST("/user/signup")
    fun requestSignup (@Body body: RequestSignup) : Call<ResponseSignup>
}