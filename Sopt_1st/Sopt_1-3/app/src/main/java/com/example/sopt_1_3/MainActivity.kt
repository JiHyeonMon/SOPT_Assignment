package com.example.sopt_1_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_con.setOnClickListener {
            val intent1 = Intent(this, ConActivity::class.java)
            startActivity(intent1)
        }
        btn_lin.setOnClickListener {
            val intent2 = Intent(this, LinActivity::class.java)
            startActivity(intent2)
        }
        btn_rel.setOnClickListener {
            val intent3 = Intent(this, RelActivity::class.java)
            startActivity(intent3)
        }

    }
}
