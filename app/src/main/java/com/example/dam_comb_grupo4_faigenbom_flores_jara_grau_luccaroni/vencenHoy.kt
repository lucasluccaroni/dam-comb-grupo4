package com.example.dam_comb_grupo4_faigenbom_flores_jara_grau_luccaroni

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VencenHoyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vencen_hoy)

        // Boton volver
        val btnVolver = findViewById<LinearLayout>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            finish()
        }

        // Botones Cobrar
        val btnCobrar1 = findViewById<TextView>(R.id.btnCobrarSocio1)
        val btnCobrar2 = findViewById<TextView>(R.id.btnCobrarSocio2)
        val btnCobrar3 = findViewById<TextView>(R.id.btnCobrarSocio3)
        val btnCobrar4 = findViewById<TextView>(R.id.btnCobrarSocio4)
        val btnCobrar5 = findViewById<TextView>(R.id.btnCobrarSocio5)

        // Todos llevan a la pantalla de cobro
        val irACobrar = View.OnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            // Reemplazá MainActivity por la Activity de cobro de tu compañero
        }

        btnCobrar1.setOnClickListener(irACobrar)
        btnCobrar2.setOnClickListener(irACobrar)
        btnCobrar3.setOnClickListener(irACobrar)
        btnCobrar4.setOnClickListener(irACobrar)
        btnCobrar5.setOnClickListener(irACobrar)

        // Barra de navegacion
        val navInicio = findViewById<LinearLayout>(R.id.nav_inicio)
        val navMiembros = findViewById<LinearLayout>(R.id.nav_miembros)
        val navCobrar = findViewById<LinearLayout>(R.id.nav_cobrar)
        val navMas = findViewById<LinearLayout>(R.id.nav_mas)

        navInicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        navMiembros.setOnClickListener {
            // Intent a Activity de miembros de tu compañero
        }

        navCobrar.setOnClickListener {
            // Intent a Activity de cobrar de tu compañero
        }

        navMas.setOnClickListener {
            // Intent a Activity de mas de tu compañero
        }
    }
}