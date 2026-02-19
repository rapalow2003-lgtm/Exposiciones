package com.example.kotlin_clasesfunciones

class Persona(val nombre:String, val edad:Int, val ciudad: String, val id: Int) {
    val mensaje ="Hola mi nombre es $nombre y tengo $edad anios soy de $ciudad y mi DNI comienza con $id"
}

fun main() {
    val persona = Persona("Walter",22,"Santa Barbara",1615)

    println(persona.mensaje)
}