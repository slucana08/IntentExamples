package com.kotlin.cursos.intentexamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val myIntent = intent.extras.get("datos") as Datos
        info_TextView.text = "Mis Nombres son: ${myIntent.nombres + " " + myIntent.apellidos}"
    }
}
