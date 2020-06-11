package com.example.sopt_2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = MainAdapter(supportFragmentManager)
        viewpager.offscreenPageLimit = 4

        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                bottomNavigationView.menu.getItem(position).isChecked = true
            }
        })

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_webtoon -> viewpager.currentItem = 0
                R.id.menu_done -> viewpager.currentItem = 1
                R.id.menu_best -> viewpager.currentItem = 2
                R.id.menu_my -> viewpager.currentItem = 3
                R.id.menu_more -> viewpager.currentItem = 4
            }
            true
        }
    }
}
