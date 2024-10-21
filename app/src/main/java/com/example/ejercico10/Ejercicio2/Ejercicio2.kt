package com.example.ejercico10.Ejercicio2

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercico10.R

class Ejercicio2 : AppCompatActivity() {
    private val int = 10000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio2)

        var botoncambiaactivity :Button = findViewById(R.id.botoncambiaactivity)
        botoncambiaactivity.setOnClickListener{
            // Crear un Intent para el segundo Activity
            val intent = Intent(this, Ejercicio2Activity::class.java)

            // Crear el PendingIntent
            val crearPedingRetraso = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
            Handler(mainLooper).postDelayed({
                try {
                    crearPedingRetraso.send()
                } catch (e: PendingIntent.CanceledException) {
                    e.printStackTrace()
                }
            }, int.toLong())

        }

    }

}