package com.saher.recicleview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saher.recicleview.databinding.ItemSuperheroBinding

class AmigoViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    private var binding= ItemSuperheroBinding.bind(view)

    fun render(amigo: Amigo){
        binding.tvAmigo.text = amigo.amigo
        binding.tvDescripcion.text = amigo.descripcion
        binding.tvPasatiempo.text = amigo.pasatiempo
        Glide.with(binding.ivAmigo.context).load(amigo.image).into(binding.ivAmigo)


    }
}