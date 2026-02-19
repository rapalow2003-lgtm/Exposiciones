package EjerGrupo3.While

class Validador {

    fun iniciarSesion() {
        val claveCorrecta = "1234"
        var clave = ""
        var intentos = 0
        val maxIntentos = 3

        while (clave != claveCorrecta && intentos < maxIntentos) {
            print("Ingrese la contraseña: ")
            println("")
            clave = readLine() ?: ""

            if (clave != claveCorrecta) {
                intentos++
                println("")
                println("Contraseña incorrecta ($intentos/$maxIntentos)")
            }
        }

        if (clave == claveCorrecta) {
            println("")
            println("Acceso permitido, bienvenido")
        } else {
            println("")
            println("Acceso bloqueado - Demasiados intentos")
        }
    }
}
