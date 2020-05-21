package com.example.sopt_3_2.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sopt_3_2.R
import com.example.sopt_3_2.data.RequestSignin
import com.example.sopt_3_2.data.ResponseSignin
import com.example.sopt_3_2.main.MainActivity
import com.example.sopt_3_2.network.RequestSigninToServer
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.activity_signin.editId
import kotlinx.android.synthetic.main.activity_signin.editPwd
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SigninActivity : AppCompatActivity() {

    val requestSigninToServer = RequestSigninToServer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        btnSignin.setOnClickListener {
            if(editId.text.isNullOrBlank() || editPwd.text.isNullOrBlank()){
                Toast.makeText(this, "아이디와 비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else{
                requestSigninToServer.service.requestSignin(
                    RequestSignin(
                        id = editId.text.toString(),
                        password = editPwd.text.toString()
                    )
                ).enqueue(object :Callback<ResponseSignin>{
                    override fun onFailure(call: Call<ResponseSignin>, t: Throwable) {
                        Toast.makeText(this@SigninActivity, "실패", Toast.LENGTH_SHORT).show()

                    }

                    override fun onResponse(
                        call: Call<ResponseSignin>,
                        response: Response<ResponseSignin>
                    ) {
                        if(response.isSuccessful){
                            Toast.makeText(this@SigninActivity, response.body()?.message, Toast.LENGTH_SHORT).show()
                            if(response.body()!!.success){
                                val intent = Intent(this@SigninActivity, MainActivity::class.java)
                                startActivity(intent)
                                finish()
                            }else{
                                Toast.makeText(this@SigninActivity, "아이디와 비밀번호를 확인하세요.", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }

                })
            }
        }

        txtSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }


}
