package M3_A07

import utils.*
import kotlin.system.exitProcess

fun main() {
    var exercici: Int
    val MENU: String = "\n" +
            "\n1. Algoritme que mostra els números del 10 al 0, i al final, BOOOOOM!!" +
            "\n2. Algoritme que demana una paraula a l'usuari i la mostra 100 vegades" +
            "\n3. Algoritme que demana l'edat i mostra els anys que aquest ha anat complint" +
            "\n4. Algoritme que demana un número, i mostra seqüencialment des d'aquest número fins al 0" +
            "\n5. Algoritme que mostra la taula de multiplicar del 3" +
            "\n6. Algoritme que demana un número i mostra per pantalla la seva taula de multiplicar" +
            "\n7. Sortir del programa"

    do {
        println("${BLUE_BOLD}Escriu l'exercici que vols fer (1..7): ${RESET}")
        println(MENU)
        exercici = readln().toInt()
        when  (exercici) {
            1 ->  {
                for(i in 10 downTo 0 step 1)
                    println("$i ")
                println("${RED}BOOOOOM!!$RESET")
            }
            2 -> {
                print("Escriu una paraula que es mostrarà 100 vegades: ")
                val paraula = readln().toString()
                for(i in 1..100) {
                    println("$i $paraula")
                }
            }
            3 -> {

                print("Escriu la teva edat: ")
                val edat = readln().toInt()
                for(i in 1..edat)
                    println("$i anys")
            }
            4 -> {
                print("Escriu una número que es mostrarà seqüencialment des d'aquest número fins al 0: ")
                val numero = readln().toInt()
                for(i in numero downTo 0 step 1)
                    println("$i ")
            }
            5 -> {
                for (i in 1..10) {
                    val resultado = i * 3
                    println("3 * $i = $resultado")
                }
            }
            6 -> {
                print("Escriu una número per fer la seva taula de multiplicar: ")
                val numero = readln().toInt()

                for (i in 1..10) {
                    val resultado = i * numero
                    println("$numero * $i = $resultado")
                }
            }
            7 -> {
                println("${RED}Sortiràs del programa, fins aviat!${RESET}")
            }
            else -> println("Exercici no vàlid")
        }
    } while (exercici != 7)
}