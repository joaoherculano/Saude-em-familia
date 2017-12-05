package com.example.central.projeto.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.central.projeto.R
import kotlinx.android.synthetic.main.item_question.view.*

/**
 * Created by Central on 04/12/2017.
 */
class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var medico: TextView
    var horario: TextView
    var psf: TextView
    var ivResult: ImageView
    
    init {
        medico = itemView.findViewById(R.id.tv_medico) as TextView
        psf = itemView.findViewById(R.id.tv_psf) as TextView
        horario = itemView.findViewById(R.id.tv_horario) as TextView
        ivResult = itemView.findViewById(R.id.iv_imagem) as ImageView
    }
}
