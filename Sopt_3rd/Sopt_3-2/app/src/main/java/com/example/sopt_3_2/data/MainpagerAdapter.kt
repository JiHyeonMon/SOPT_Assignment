package com.example.sopt_3_2.data

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.sopt_3_2.main.GridFragment
import com.example.sopt_3_2.main.RecyclerFragment

class MainpagerAdapter (fm:FragmentManager):
        FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> RecyclerFragment()
            else -> GridFragment()
        }
    }

    override fun getCount() = 2

}