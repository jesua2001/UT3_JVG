package com.example.ejercico10.Ejercicio1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercico10.databinding.ActivityEjercicio1Binding

class Ejercicio1 : AppCompatActivity() {

    // Declarar una variable de binding específica para Ejercicio1
    private lateinit var binding: ActivityEjercicio1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar el binding para activity_ejercicio1.xml
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)

        // Establecer la vista raíz usando el binding
        setContentView(binding.root)

        // Configurar el botón para validar y abrir la URL
        binding.botonUrl.setOnClickListener {
            val urlText = binding.editTextText.text.toString()

            // Verificar que el campo no esté vacío y que la URL sea válida
            if (urlText.isEmpty()) {
                Toast.makeText(this, "Por favor, introduce una URL", Toast.LENGTH_SHORT).show()
            } else if (!validarURL(urlText)) {
                Toast.makeText(this, "Introduce una URL válida", Toast.LENGTH_SHORT).show()
            } else {
                // Si la URL es válida, intenta abrirla con un Intent
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlText))
                startActivity(intent)
            }
        }
    }

    // Función para validar la URL
    private fun validarURL(url: String): Boolean {
        return Patterns.WEB_URL.matcher(url).matches()
    }
}
