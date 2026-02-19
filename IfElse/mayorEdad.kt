package EjerGrupo3.IfElse

class mayorEdad {

    fun verificarEdad(edad: Int): String {
        if (edad < 0 || edad > 120) {
            return "Edad invalida 😕"
        }

        if (edad >= 18) {
            return "Eres MAYOR de edad, tienes($edad años)"
        } else {
            return "Eres MENOR de edad, tienes ($edad años)"
        }
    }
}
