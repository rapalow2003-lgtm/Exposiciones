package EjerGrupo3.DoWhile

class Menu {

        fun mostrarMenu() {
            var opcion: Int?

            do {
                println("---- MENU ----")
                println("1. Saludar")
                println("2. Salir")
                print("Seleccione: ")

                val entrada = readLine()
                opcion = entrada?.toIntOrNull()

                if (opcion != null) {
                    when (opcion) {
                        1 -> println("¡Hola usuario!")
                        2 -> println("Saliendo...")
                        else -> println("Opcion incorrecta")
                    }
                } else {
                    println("¡Debe ingresar un numero!")
                }

            } while (opcion != 2)
        }

}