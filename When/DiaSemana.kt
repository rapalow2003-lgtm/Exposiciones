package EjerGrupo3.When

class DiaSemana {
    fun obtenerDia(numero: Int): String {
        return when (numero) {
            1 -> "📅 Lunes"
            2 -> "📅 Martes"
            3 -> "📅 Miercoles"  // ← Corregí acento
            4 -> "📅 Jueves"
            5 -> "📅 Viernes"
            6 -> "📅 Sábado"     // ← Corregí acento
            7 -> "📅 Domingo"
            else -> "Numero invalido (use 1-7)"
        }
    }
}
