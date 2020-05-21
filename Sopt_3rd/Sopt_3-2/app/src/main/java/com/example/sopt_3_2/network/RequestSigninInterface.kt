package com.example.sopt_3_2.network


import com.example.sopt_3_2.data.RequestSignin
import com.example.sopt_3_2.data.ResponseSignin
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestSigninInterface{
    @POST("/user/signin")
    fun requestSignin(@Body body : RequestSignin) : Call<ResponseSignin>
}