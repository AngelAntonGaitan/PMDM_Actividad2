package com.example.actividad2pmdm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.actividad2pmdm.model.Serie

class SerieAdapter(val series: List<Serie>) : RecyclerView.Adapter<SerieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SerieViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        return SerieViewHolder(layoutInflater.inflate(R.layout.item_serie, parent, false))
    }

    override fun getItemCount(): Int = series.size

    override fun onBindViewHolder(holder: SerieViewHolder, position: Int) {
        val item : Serie = series[position]
        holder.bind(item)
    }
}
    