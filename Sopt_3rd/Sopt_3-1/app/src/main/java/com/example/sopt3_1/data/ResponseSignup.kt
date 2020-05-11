package com.example.sopt3_1.data

data class ResponseSignup(
    val status: Int,
    val success: Boolean,
    val message: String,
    val data: SomeData?
)

data class SomeData(
    val jwt: String
)