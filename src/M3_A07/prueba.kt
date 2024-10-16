package M3_A07

import java.util.Scanner

fun main() {
    val lector:Scanner = Scanner (System.`in`)
    val x: Int
    var valorCorrecte: Boolean = false

    do {
        println("Hola! Escriu un número entre del 0 al 10")
        valorCorrecte = lector.hasNextInt()

        if(valorCorrecte == false) {
            println("ERROR: Has escrit -> ${lector.nextLine()}")
        }
    }while (valorCorrecte == false)
    x = lector.nextInt()
    println("Has escrit el numero -> $x")
}
