package com.example.ejercico10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejercico10.Ejercicio1.Ejercicio1
import com.example.ejercico10.Ejercicio2.Ejercicio2
import com.example.ejercico10.Ejercicio3.Ejercicio3
import com.example.ejercico10.Ejercicio4.Ejercicio4
import com.example.ejercico10.Ejercicio5.Ejercicio5
import com.example.ejercico10.Ejercicio6.Ejercicio6

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var  botonejercicio1 : Button = findViewById(R.id.ejercicio1)
        botonejercicio1.setOnClickListener{
        val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }
        var  botonejercicio2 : Button =findViewById(R.id.ejercicio2)
        botonejercicio2.setOnClickListener{
            val intent = Intent(this,Ejercicio2::class.java)
            startActivity(intent)
        }
        var  botonejercicio3 : Button = findViewById(R.id.ejercicio3)
        botonejercicio3.setOnClickListener{
            val intent = Intent(this,Ejercicio3::class.java)
            startActivity(intent)
        }
        var  botonejercico4 : Button = findViewById(R.id.ejercicio4)
        botonejercico4.setOnClickListener{
            val  intent = Intent(this,Ejercicio4::class.java)
            startActivity(intent)
        }
        var bontonejercicio5 : Button = findViewById(R.id.ejercicio5)
        bontonejercicio5.setOnClickListener{
            val intent = Intent(this,Ejercicio5::class.java)
            startActivity(intent)
        }
        var botonejercicio6 : Button = findViewById(R.id.ejercicio6)
        botonejercicio6.setOnClickListener{
            val intent = Intent(this,Ejercicio6::class.java)
            startActivity(intent)
        }
    }

}