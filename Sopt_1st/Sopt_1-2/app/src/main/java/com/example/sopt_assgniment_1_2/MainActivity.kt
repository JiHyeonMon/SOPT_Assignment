package com.example.sopt_assgniment_1_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(intent.hasExtra("id") && intent.hasExtra("pwd")){
            txtId.text = intent.getStringExtra("id")
            txtPwd.text = intent.getStringExtra("pwd")
        }

    }

}
