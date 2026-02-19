//OperadoresIgualdad.kt
//Grupo #2
// Integrantes: Walter Rápalo, Yadira Arriaga, Diany Enamorado y Anderson García
// 15 de Febrero 2025

package com.example.examples

fun main() {

    val juego = NumeroSecreto()
    println("Ingrese su numero: ")
    val num = readln().toInt()
    println("El numero que usted ingreso: ${juego.verificarNumero(num)}")
    println("El numero correcto es: ${juego.verificarNumero(num)}")
}

class NumeroSecreto {

    private val numeroSecreto = 7

    fun verificarNumero(numero: Int): Boolean {
        return numero == numeroSecreto
    }
}