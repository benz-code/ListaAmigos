package com.saher.recicleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AmigoAdapter(val amigoList: List<Amigo>): RecyclerView.Adapter<AmigoViewHolder>(){


    override fun getItemCount(): Int = amigoList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AmigoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AmigoViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: AmigoViewHolder, position: Int) {
        val item = amigoList[position]
        holder.render(item)
    }

}