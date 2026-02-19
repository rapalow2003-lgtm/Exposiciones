package com.example.kotlin_clasesfunciones
class Rectangulo(val base: Double, val altura: Double) {

    val area: Double
        get() = base * altura

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    fun calcularArea(): Double {
        return base * altura
    }
}

fun main() {
    val rect = Rectangulo(8.0, 8.0)
    println("El area es: ${rect.area}")
    println("El perímetro es: ${rect.calcularPerimetro()}")
}
