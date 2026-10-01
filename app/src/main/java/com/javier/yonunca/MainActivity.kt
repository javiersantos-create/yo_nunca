package com.javier.yonunca

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val arrayFrases = arrayOf(
        "Yo nunca me he equivocado de autobús o tren y he acabado en otra ciudad.",
        "Yo nunca me he quedado dormido en clase o en el trabajo.",
        "Yo nunca he chocado contra una puerta de cristal transparente.",
        "Yo nunca he fingido hablar por teléfono para evitar a alguien.",
        "Yo nunca me he caído en público y he fingido que estaba corriendo.",
        "Yo nunca he enviado un mensaje al grupo equivocado criticando a alguien de ese grupo.",
        "Yo nunca me he comido algo del suelo aplicando la regla de los 5 segundos.",
        "Yo nunca he fingido saber cocinar una receta que en realidad compré hecha.",
        "Yo nunca me he salido de un grupo de WhatsApp e inventado una excusa para volver a entrar.",
        "Yo nunca he reído tanto que se me ha salido la bebida por la nariz."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bNext = findViewById<Button>(R.id.next)
        val bFrase = findViewById<TextView>(R.id.frase)

        bNext.setOnClickListener {
            val nAleatorio = arrayFrases.indices.random()
            bFrase.text = arrayFrases[nAleatorio]
        }
    }
}
