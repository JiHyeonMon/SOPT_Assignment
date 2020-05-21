package com.example.sopt_3_2.data

data class ResponseSignin(
    val status : Int,
    val success : Boolean,
    val message : String,
    val data : SomeData?
)

data class SomeData(
    val jwt : String
)