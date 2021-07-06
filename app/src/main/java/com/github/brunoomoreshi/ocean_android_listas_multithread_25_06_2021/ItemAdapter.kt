package com.github.brunoomoreshi.ocean_android_listas_multithread_25_06_2021

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

data class Filme(
    val nome: String,
    val imagemUrl: String
)

class ItemAdapter (
    //Coloque o nome da data class abaixo:
    val itens: List<Filme>
        ) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Filme) {
            val ivImagem = itemView.findViewById<ImageView>(R.id.ivImagem)
            val tvNome = itemView.findViewById<TextView>(R.id.tvNome)

            val capaPadrao = ResourcesCompat.getDrawable(itemView.resources, R.drawable.capa_padrao, null)

            ivImagem.setImageDrawable(capaPadrao)

            Glide.with(itemView).load(item.imagemUrl).into(ivImagem)

            tvNome.text = item.nome
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]
        holder.bindView(item)
    }

    override fun getItemCount() = itens.count()

}