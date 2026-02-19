package EjerGrupo3.For

class Evaluador {

    fun evaluarNumero(numero: Int): String {
        if (numero > 0) {
            return "El numero $numero es POSITIVO"
        } else if (numero < 0) {
            return "El numero $numero es NEGATIVO"
        }

        return "El numero es CERO ⚠️"
    }
}
