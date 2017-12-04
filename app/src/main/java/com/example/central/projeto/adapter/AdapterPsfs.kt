package com.example.central.projeto.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.central.projeto.R
import com.example.central.projeto.models.beans.beans

/**
 * Created by Central on 30/11/2017.
 */
class AdapterPsfs(internal var c: Context, internal var complaints: ArrayList<beans>) :
        RecyclerView.Adapter<SetTextView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetTextView {
        val v = LayoutInflater.from(c).inflate(R.layout.item_posto, parent, false)
        return SetTextView(v)
    }

    override fun onBindViewHolder(holder: SetTextView, position: Int) {
        holder.tvPostoHorario.text = complaints[position].horario
        holder.tvPostoMedico.text = complaints[position].medico
        //holder.urlImage = complaints[position].imagem

        Glide.with(c).load(holder.urlImage).into(holder.tvImage);

    }

    // Get Size List
    override fun getItemCount(): Int {
        return complaints.size
    }
}