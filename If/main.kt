package EjerGrupo3.If

import EjerGrupo3.For.Evaluador

fun main() {

    val evaluador = Evaluador()

    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    val resultado = evaluador.evaluarNumero(numero)

    println(resultado)
}