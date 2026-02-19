//OperadoresIncremento.kt
//Grupo #2
// Integrantes: Walter Rápalo, Yadira Arriaga, Diany Enamorado y Anderson García
// 15 de Febrero 2025

package com.example.examples

fun main(){
    val cont = Contador()
    println("Valor inicial: ${cont.numero}")
    cont.incrementar()
    println("Vaor final: ${cont.numero}")
}
class Contador {

    var numero: Int = 8

    fun incrementar() {
        numero++
    }
}
