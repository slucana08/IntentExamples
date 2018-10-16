package com.kotlin.cursos.intentexamples

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun secondActivity(view : View){
        var secondIntent = Intent(this, SecondActivity::class.java)
        if (nombres_EditText.text.toString() == "" || apellidos_EditText.text.toString() == "")
            Toast.makeText(this, "Debe llenar ambos campos ",Toast.LENGTH_SHORT).show()
        else {
        var datos = Datos(nombres_EditText.text.toString(),apellidos_EditText.text.toString())
        secondIntent.putExtra("datos",datos as Serializable)
        startActivity(secondIntent)
        }
    }
}
