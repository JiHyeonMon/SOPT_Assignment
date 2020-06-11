package com.example.sopt_2_2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.sopt_2_2.fragment.*

class MainAdapter(fm:FragmentManager):
        FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> webtoon()
            1-> done()
            2-> best()
            3->my()
            else -> more()

        }
    }

    override fun getCount() = 5

}