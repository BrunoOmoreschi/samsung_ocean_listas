package com.github.brunoomoreshi.ocean_android_listas_multithread_25_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adapter == classe do android que server como base para uma lista.
        // Cada lista precisa de uma adapter customizado
        // A customização serve para dizer como o adapter irá carregar elementos
        // Além disso, o adapter define o Layout XML de cada item,
        // e como faremos para inserir informações desse layout.

        // LayoutManager ==Também é uma classe do Android que usamos para definir
        //como uma lista será estruturada
        //As opções são: Linear (Horizontal ou Vertical), Staggered, et
        val rvLista = findViewById<RecyclerView>(R.id.rvLista)

        rvLista.layoutManager = LinearLayoutManager(this)

        val harryPotter = Filme(nome= "Harry Potter", imagemUrl= "https://static.wikia.nocookie.net/harrypotter/images/9/9c/Capa_Harry_Potter_e_a_Pedra_Filosofal_%28filme%29.jpg/revision/latest?cb=20130101153136&path-prefix=pt-br")
        val senhordosaneis = Filme(nome = "Senhor dos Aneis", imagemUrl = "https://upload.wikimedia.org/wikipedia/pt/3/38/Lord_of_the_Rings_Fellowship_of_the_Ring.jpg")
        val curtindoavidaadoidado = Filme(  nome = "Curtindo a vida adoidado", imagemUrl = "https://capas-g.wmixvideo.com.br/cx106024.jpg")

        val items = listOf(harryPotter,senhordosaneis,curtindoavidaadoidado)

        rvLista.adapter = ItemAdapter(items)
    }
}