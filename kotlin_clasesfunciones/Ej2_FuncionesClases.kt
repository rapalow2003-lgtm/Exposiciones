package com.example.kotlin_clasesfunciones

class Estudiante(val id: Int, val nombre: String?, var nota1: Double, var nota2: Double, var nota3: Double) {

    fun calcularPromedio(): Double {
        return (nota1 + nota2 + nota3) / 3
    }

    fun aprobo(): Boolean {
        return calcularPromedio() >= 70
    }

    fun mostrarInformacion() {
        println("")
        println("Estudiante: $nombre")
        println("ID del estudiante: $id")
        println("Promedio: ${calcularPromedio()} %")
        println("Aprobo: ${aprobo()}")
    }
}

fun main() {
    print("Ingrese el ID del estudiante: ")
    val id = readln().toInt()

    print("Ingrese el nombre del estudiante:")
    val nombre = readln()

    println("")
    println("Ingrese las notas:")
    print("Nota 1: ")
    val n1 = readln().toDouble()
    print("Nota 2: ")
    val n2 = readln().toDouble()
    print("Nota 3: ")
    val n3 = readln().toDouble()

    val estudiante = Estudiante(id, nombre, n1, n2, n3)
    estudiante.mostrarInformacion()
}
