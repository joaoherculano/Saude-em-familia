package com.example.central.projeto.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.central.projeto.R
import com.example.central.projeto.R.id.tvPostoHorario

/**
 * Created by Central on 30/11/2017.
 */
class SetTextView (itemView: View) : RecyclerView.ViewHolder(itemView) {

    var tvPostoMedico: TextView
    var tvPostoHorario: TextView
    var tvImage: ImageView
    var urlImage: String = ""

    init {
        tvPostoMedico = itemView.findViewById(R.id.tvPostoMedico) as TextView
        tvPostoHorario = itemView.findViewById(R.id.tvPostoHorario) as TextView
        tvImage = itemView.findViewById(R.id.ivPostoImagem) as ImageView
    }

}