package com.example.central.projeto.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.central.projeto.Beans.Informacoes
import com.example.central.projeto.R

/**
 * Created by Central on 04/12/2017.
 */
class AdapterComplaint(internal var c: Context, internal var informacoes: ArrayList<Informacoes>) :
        RecyclerView.Adapter<MyViewHolder>() {

    // Set Layout Recycler View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(c).inflate(R.layout.item_question, parent, false)
        return MyViewHolder(v)
    }

    // Set Values from Data Firebase
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.psf.text = informacoes[position].psf
        holder.horario.text = informacoes[position].horario
        holder.nome_medico.text = informacoes[position].nome_medico
    }

    // Get Size List
    override fun getItemCount(): Int {
        return informacoes.size
    }


}