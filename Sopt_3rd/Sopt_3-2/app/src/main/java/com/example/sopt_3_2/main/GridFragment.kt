package com.example.sopt_3_2.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.sopt_3_2.R
import com.example.sopt_3_2.data.InstaAdapter
import com.example.sopt_3_2.data.InstaData
import kotlinx.android.synthetic.main.fragment_grid.*
import kotlinx.android.synthetic.main.fragment_recycler.*


class GridFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grid, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //추후 그리드를 완성시켜보도록 하자^^
    }

}
