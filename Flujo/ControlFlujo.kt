package EjerGrupo3.Flujo

class ControlFlujo {

    fun ejemplo(numero: Int) {
        // RETURN: termina la función si el número es negativo
        if (numero < 0) {
            println("Numero invalido")
            return
        }

        println("Iniciando conteo hasta $numero")

        var numerosImpresos = 0

        for (i in 1..numero) {
            if (i == 5) {
                println("Se salto el 5")
                continue
            }
            if (i == 10 || numerosImpresos >= 10) {
                println("Se detuvo en el $i (límite alcanzado)")
                break
            }

            println("Numero: $i")
            numerosImpresos++
        }

        println("Fin del programa (imprimio $numerosImpresos numeros)")
    }
}
