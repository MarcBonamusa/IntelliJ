package M3_A07

/**
 * Escriu un programa que presenti el següent menú d’opcions relacionades amb les propietats
 * dels triangles i que permeti resoldre les operacions indicades.
 *
 * @author Marc Bonamusa
 * @since 9/10/2024
 *
 **/

import utils.*
import java.util.*
import kotlin.math.sqrt

fun main() {
    val lector: Scanner = Scanner (System.`in`)
    var a: Float
    var b: Float
    var c: Float
    var valorCorrecte: Boolean = false
    var exercici: Int
    val MENU: String = "\n1. Comprovar si tres segments poden formar un triangle" +
            "\n2. Comprovar si és un triangle rectangle" +
            "\n3. Classificar el triangule d’acord als seus costats" +
            "\n4. Calcular perímetre i àrea" +
            "\n0. Sortir del programa"

    do {
        println("${GREEN_BOLD}Escriu l'exercici que vols fer (1..4): $RESET")
        println(MENU)
        exercici = readln().toInt()
        when  (exercici) {
            1 ->  {
                do {
                    print("Introdueix la longitud del costat a: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                a = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                b = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                c = lector.nextFloat()
                lector.nextLine()

                if ((a - c) < b && b < (a + c)) {
                    println("${BLUE}Els 3 segments SI que poden formar un triangle$RESET")
                } else {
                    println("${RED}Els 3 segments NO poden formar un triangle$RESET")
                }

            }
            2 -> {
                var a = 0f
                do {
                    print("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                b = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                } while (valorCorrecte == false)
                c = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat a (ha de ser més gran que b i c): ")
                    valorCorrecte = lector.hasNextInt()
                    if (valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    } else {
                        a = lector.nextFloat()
                        lector.nextLine()
                        if (a <= b || a <= c) {
                            println("${RED_BOLD}ERROR: El costat a ha de ser més gran que b i c$RESET")
                            valorCorrecte = false
                        }
                    }
                    if((a * a)== (b * b + c * c)) {
                        println("${BLUE}Les 3 longituds SI que poden formar un triangle rectangle$RESET")
                        println("${BLUE}La hipotenusa és: a = $a$RESET")
                        println("${BLUE}Els seus catets són: b = $b i c = $c$RESET")
                    }else{
                        println("${RED}Les 3 longituds NO poden formar un triangle rectangle$RESET")
                    }
                } while (valorCorrecte == false)
            }
            3 -> {
                do {
                    print("Introdueix la longitud del costat a: ")
                    valorCorrecte = lector.hasNextInt()
                    if(valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                }while (valorCorrecte == false)
                a = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if(valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                }while (valorCorrecte == false)
                b = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if(valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                }while (valorCorrecte == false)
                c = lector.nextFloat()
                lector.nextLine()

                when {
                    a == b && b == c -> {
                        println("${BLUE}El triangle és equilàter$RESET.")
                    }
                    a == b || b == c || a == c -> {
                        println("${BLUE}El triangle és isòsceles$RESET.")
                    }
                    else -> {
                        println("${BLUE}El triangle és escalè$RESET.")
                    }
                }
            }

            4 -> {
                do {
                    print("Introdueix la longitud del costat a: ")
                    valorCorrecte = lector.hasNextInt()
                    if(valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                }while (valorCorrecte == false)
                a = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat b: ")
                    valorCorrecte = lector.hasNextInt()
                    if(valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                }while (valorCorrecte == false)
                b = lector.nextFloat()
                lector.nextLine()

                do {
                    print("Introdueix la longitud del costat c: ")
                    valorCorrecte = lector.hasNextInt()
                    if(valorCorrecte == false) {
                        println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                        lector.nextLine()
                    }
                }while (valorCorrecte == false)
                c = lector.nextFloat()
                lector.nextLine()

                val perimetre = a + b + c
                println("El perímetre del triangle és: ${BLUE}$perimetre$RESET")

                val semi = perimetre / 2
                val area = sqrt(semi * (semi - a) * (semi - b) * (semi - c))
                println("L'àrea del triangle és: ${BLUE}$area$RESET")
            }
            0 -> {
                println("${RED_BOLD}Sortiràs del programa, fins aviat!$RESET")
            }
            else -> println("${RED_BOLD}Exercici no vàlid$RESET")
        }
    } while (exercici != 0)
}