package com.example.sopt_3_2.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.sopt_3_2.R
import com.example.sopt_3_2.data.MainpagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_viewPager.adapter =
            MainpagerAdapter(supportFragmentManager)
        main_viewPager.offscreenPageLimit=2
//        main_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
//            override fun onPageScrollStateChanged(state: Int) {
//
//            }
//
//            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {
//            }
//
//            override fun onPageSelected(position: Int) {
//                bottomNavigationView.menu.getItem(position).isChecked = true
//            }
//
//        })

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_recycler -> main_viewPager.currentItem = 0
                R.id.menu_grid-> main_viewPager.currentItem = 1
            }
            true
        }

    }
}
