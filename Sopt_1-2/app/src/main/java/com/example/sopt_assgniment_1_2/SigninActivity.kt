package com.example.sopt_assgniment_1_2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.activity_signin.editId
import kotlinx.android.synthetic.main.activity_signin.editPwd
import kotlinx.android.synthetic.main.activity_signup.*
import java.time.chrono.MinguoChronology

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        var id: EditText = findViewById(R.id.editId)
        var pwd: EditText = findViewById(R.id.editPwd)

        Log.d("start","start")
        //로그인 버튼 클릭 - 홈화면
        btnSignin.setOnClickListener {
            Log.d("00","00")
            //아이디 혹은 비밀번호 빈칸일 경우
            if(editId.text.isNullOrBlank()||editPwd.text.isNullOrBlank()){
                Log.d("d","d")
                Toast.makeText(this, "아이디 또는 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
            //둘 다 입력 잘되면 홈화면으로 이동
            else{
                val intent = Intent(this, MainActivity::class.java)

                intent.putExtra("id", editId.text.toString())
                intent.putExtra("pwd", editPwd.text.toString())
                startActivity(intent)
            }
        }

        //회원가입하기 - 회원가입 화면 이동
        /*txtSignin.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }*/

        txtSignin.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivityForResult(intent, 200)

        }


    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK && requestCode == 200){
            val id : String? = data?.getStringExtra("id")
            val pwd : String? = data?.getStringExtra("pwd")
            editId.setText(id)
            editPwd.setText(pwd)

        }
    }
}
