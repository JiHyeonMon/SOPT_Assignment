package com.example.sopt_2_2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class WebtoonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val img = itemView.findViewById<ImageView>(R.id.img)
    val txt_title = itemView.findViewById<TextView>(R.id.txt_title)
    val txt_score = itemView.findViewById<TextView>(R.id.txt_score)
    val txt_author = itemView.findViewById<TextView>(R.id.txt_author)

    fun bind(webtoonData: WebtoonData){
        txt_title.text = webtoonData.txt_title
        txt_score.text = webtoonData.txt_score.toString()
        txt_author.text = webtoonData.txt_author
        Glide.with(itemView).load(webtoonData.img).into(img)
    }
}