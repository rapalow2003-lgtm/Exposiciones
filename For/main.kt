package EjerGrupo3.For

fun main() {
    val contador = Contador()

    print("Ingrese un numero: ")

    val numero = readLine()!!.toInt()

    contador.contar(numero)
}