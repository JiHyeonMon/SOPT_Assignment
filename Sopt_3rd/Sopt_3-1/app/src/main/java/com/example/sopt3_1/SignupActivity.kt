package com.example.sopt3_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sopt3_1.data.RequestSignup
import com.example.sopt3_1.data.ResponseSignup
import com.example.sopt3_1.network.RequestToServer
import kotlinx.android.synthetic.main.activity_signup.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignupActivity : AppCompatActivity() {

    val requestToServer:RequestToServer = RequestToServer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnSignup.setOnClickListener {
            if(editId.text.isNullOrBlank()||editPwd.text.isNullOrBlank()){
                Toast.makeText(this, "아이디와 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()

            }else{
                requestToServer.service.requestSignup(
                    RequestSignup(
                        id = editId.text.toString(),
                        password = editPwd.text.toString(),
                        name = editName.text.toString(),
                        email = editEmail.text.toString(),
                        phone = editPhone.text.toString()
                    )
                ).enqueue(object :Callback<ResponseSignup>{
                    override fun onFailure(call: Call<ResponseSignup>, t: Throwable) {
                        //통신 실패
                        Toast.makeText(this@SignupActivity, t.message, Toast.LENGTH_SHORT).show()
                    }

                    override fun onResponse(
                        call: Call<ResponseSignup>,
                        response: Response<ResponseSignup>
                    ) {
                        //통신 성공
                        if(response.isSuccessful){
                            if(response.body()!!.success){
                                Toast.makeText(this@SignupActivity, "회원가입 성공", Toast.LENGTH_SHORT).show()
                                val intent = Intent(this@SignupActivity, MainActivity::class.java)
                                startActivity(intent)
                                finish()
                            }else{
                                Toast.makeText(this@SignupActivity, "이미 존재하는 아이디입니다.: )", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }

                })

            }
        }


    }


}
