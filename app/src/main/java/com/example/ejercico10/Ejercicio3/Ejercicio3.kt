package com.example.ejercico10.Ejercicio3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercico10.R

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio3)

        var btnrojo : Button = findViewById(R.id.botonRojo)
        btnrojo.setOnClickListener{
            val intent =Intent(this,rojo::class.java)
            startActivity(intent)
        }
        var btnverde : Button = findViewById(R.id.botonverde)
        btnverde.setOnClickListener{
            val intent =Intent(this,verde::class.java)
            startActivity(intent)
        }
        var btnazul : Button = findViewById(R.id.botonazul)
        btnazul.setOnClickListener{
            val intent =Intent(this,azul::class.java)
            startActivity(intent)
        }

    }
}