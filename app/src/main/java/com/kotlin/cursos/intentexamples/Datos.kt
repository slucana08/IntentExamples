package com.kotlin.cursos.intentexamples

import java.io.Serializable

class Datos : Serializable {
    var nombres:String?=null
    var apellidos:String?=null

    constructor(nombres:String,apellidos:String) {
        this.nombres = nombres
        this.apellidos = apellidos
    }


}