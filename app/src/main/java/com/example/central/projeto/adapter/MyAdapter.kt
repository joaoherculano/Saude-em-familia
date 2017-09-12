package com.example.central.projeto.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_evento.view.*
import com.example.central.projeto.R
import com.example.central.projeto.models.evento
import java.util.ArrayList

class MyAdapter constructor(val context: Context, private val eventos: ArrayList<evento>?,
                            val clickListener:(evento)->Unit) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_evento, parent, false)
        val vh = ViewHolder(v)
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        eventos?.let{
            var evento = eventos[position]
            holder.itemView.tvNome.text = evento.nome
            holder.itemView.tvDesc.text = evento.desc
            holder.itemView.tvLocal.text = evento.local
            holder.itemView.tvHorario.text = evento.horario
            holder.itemView.setOnClickListener { clickListener(eventos[position]) }
        }
    }

    override fun getItemCount(): Int {
        if (eventos != null) {
            return eventos.size
        }else
            return 0
    }
}