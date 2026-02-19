package EjerGrupo3.For

class Contador {

    fun contar(numero: Int) {
        if (numero < 1) {
            println("Debe ser >= 1")
            return
        }
        println("")
        println("Contando del 1 a $numero:")
        println("")

        var contadorTotal = 0  // ← NUEVA VARIABLE
        for (i in 1..numero) {
            println("Numero: $i")
            contadorTotal++      // ← CUENTA CADA VEZ
        }

        println("")
        println("Total numeros contados: $contadorTotal")  // ← MUESTRA RESULTADO
    }
}
