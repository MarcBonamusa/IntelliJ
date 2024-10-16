package M3_A05

fun main() {
    //Algoritme que demana una distància en metres i mostra per pantalla
    // la conversió a milles marines.

    val menu: String = ("1. Convertir de metres a milles \n2. Convertir de milles a metres")
    var opcio: Int = 0
    var valorEntrada: Float
    var valorSortida: Float

    do {
        println("Hola que vols fer?")
        println(menu)
        opcio = readln().toInt()
        if (opcio < 1 || opcio > 2) {
            println("ERROR: Valor no acceptat")
        }
    } while ((opcio != 1) && (opcio != 2))

    when (opcio) {
        1 -> {
            println("Has triat opció 1: convertirem de metres a milles")
            println("Introdueix una distancia en metres: ")
            valorEntrada = readln().toFloat()
            valorSortida = valorEntrada * 0.000621371192f
            println("El resultat de la conversió es de: $valorSortida milles")
        }

        2 -> {
            println("Has triat opció 2: convertirem de milles a metres")
            println("Introdueix una distancia en milles: ")
            valorEntrada = readln().toFloat()
            valorSortida = valorEntrada * 16009.344f
            println("El resultat de la conversió es de: $valorSortida metres")
        }
    }
}