package com.example.kotlin_clasesfunciones

val variableglobal = "Hola soy una variable global."

fun main() {
    print("Ingrese el numero 1: ")
    val numero1:Int = readln().toInt()
    print("Ingrese el numero 2: ")
    val numero2:Int = readln().toInt()
    print("Ingrese el numero 3: ")
    val numero3:Int = readln().toInt()
    print("Escoja la operacion (1=suma, 2=resta, 3=multiplicacion, 4=division, 5=combinacion): ")
    val operador:String = readln().toString()

    when (operador) {
        "1" -> suma(numero1, numero2, numero3)
        "2" -> resta(numero1, numero2, numero3)
        "3" -> multiplicacion(numero1, numero2)
        "4" -> division(numero1, numero2)
        "5" -> combinacion(numero1, numero2, numero3)
        else -> println("Operación no válida")
    }
    println(variableglobal)
}

fun suma(valor1:Int, valor2:Int, valor3: Int) {
    println("$valor1 + $valor2 + $valor3 = ${valor1+valor2+valor3}")
}
fun resta(valor1:Int, valor2:Int, valor3: Int){
    println("$valor1 - $valor2 - $valor3 = ${valor1-valor2-valor3}")
}
fun multiplicacion(valor1:Int, valor2:Int){
    println("$valor1 x $valor2 = ${valor1*valor2}")
}
fun division(valor1:Int, valor2:Int){
    println("$valor1 / $valor2 = ${valor1/valor2}")
}

fun combinacion(valor1:Int, valor2:Int, valor3: Int) {
    println("$valor1 + $valor2 * $valor3 = ${valor1+valor2*valor3}")
}
