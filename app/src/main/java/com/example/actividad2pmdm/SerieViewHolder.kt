package com.example.actividad2pmdm

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.actividad2pmdm.databinding.ItemSerieBinding
import com.example.actividad2pmdm.model.Serie
import com.squareup.picasso.Picasso

class SerieViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemSerieBinding.bind(view)

    fun bind(serie: Serie){
        Picasso.get().load(serie.image).into(binding.ivSerie)
        binding.tvTitle.setText(serie.title)
        binding.tvCreator.setText("Creador: " + serie.creator)
        binding.tvRating.setText("Rating: "+ serie.rating.toString())
        binding.tvChannel.setText("Canal: " + serie.channel)
    }
}