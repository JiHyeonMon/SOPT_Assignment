package com.example.sopt_assgniment_1_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnSignup.setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)

            intent.putExtra("id", editId.text.toString())
            intent.putExtra("pwd", editPwd.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
