package M3_E04

import utils.*
import java.util.*

/**
 * Escriu un programa que llegeixi una data de naixement i ens digui el signe zodiacal corresponent.
 * Has d’assegurar-te que l’usuari introdueix una data de naixement correcta.
 *
 * @author Marc Bonamusa
 * @since 8/10/2024
 *
 **/

fun main() {
    val lector: Scanner = Scanner (System.`in`)
    var any: Int = 0
    var dia: Int = 0
    var mes: Int = 0
    var valorCorrecte: Boolean = false

    println("${BLUE_BOLD}Benvingut al programa per saber el teu signe zodiacal!$RESET")

    //Pel any
    do {

        do {
            print("Escriu el teu any de naixement (1900..2024): ")
            valorCorrecte = lector.hasNextInt()

            if(valorCorrecte == false) {
                println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                lector.nextLine()
            }

        }while (valorCorrecte == false)
        any = lector.nextInt()
        lector.nextLine()
        if(any < 1900 || any > 2024) println("${RED_BOLD}ERROR: Ès un any incorrecte pel sistema$RESET")
    }while (any < 1900 || any > 2024)

    println("Has nascut a l'any -> $BLUE_BOLD$any$RESET")

    //Pel mes
    do {
        print("Escriu el teu mes de naixement (1..12): ")
        valorCorrecte = lector.hasNextInt()

        if(valorCorrecte == false) {
            println("${RED_BOLD}ERROR: Introdueix un número$RESET")
            lector.nextLine()
        }

    }while (valorCorrecte == false)
    do {
        mes = lector.nextInt()
        when(mes) {
            1-> println("El teu mes de naixement es -> ${BLUE_BOLD}Gener$RESET")
            2-> println("El teu mes de naixement es -> ${BLUE_BOLD}Febrer$RESET")
            3-> println("El teu mes de naixement es -> ${BLUE_BOLD}Març$RESET")
            4-> println("El teu mes de naixement es -> ${BLUE_BOLD}Abril$RESET")
            5-> println("El teu mes de naixement es -> ${BLUE_BOLD}Maig$RESET")
            6-> println("El teu mes de naixement es -> ${BLUE_BOLD}Juny$RESET")
            7-> println("El teu mes de naixement es -> ${BLUE_BOLD}Juliol$RESET")
            8-> println("El teu mes de naixement es -> ${BLUE_BOLD}Agost$RESET")
            9-> println("El teu mes de naixement es -> ${BLUE_BOLD}Septembre$RESET")
            10-> println("El teu mes de naixement es -> ${BLUE_BOLD}Octubre$RESET")
            11-> println("El teu mes de naixement es -> ${BLUE_BOLD}Novembre$RESET")
            12-> println("El teu mes de naixement es -> ${BLUE_BOLD}Desembre$RESET")
            else -> print("${RED_BOLD}El mes $mes no existeix, escriu un altre:$RESET ")
        }

    } while (mes < 1 || mes > 12)

    //Pel dia
    do {

        do {
            print("Escriu el teu dia de naixement: ")
            valorCorrecte = lector.hasNextInt()

            if(valorCorrecte == false) {
                println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                lector.nextLine()
            }

        }while (valorCorrecte == false)
        dia = lector.nextInt()
        lector.nextLine()

        //Comprovar els dies dels mesos
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            while (dia > 31) {
                println("${RED_BOLD}El mes $mes no te mes de 31 dies$RESET")
                print("Torna a introduir el dia: ")
                dia = lector.nextInt()
            }
        } else {
            while (dia > 30) {
                println("${RED_BOLD}El mes $mes no te mes de 30 dies$RESET")
                print("Torna a introduir el dia: ")
                dia = lector.nextInt()
            }
        }
        if(mes == 2) {
            while (dia > 28) {
                println("${RED_BOLD}El mes $mes no te mes de 28 dies$RESET")
                print("Torna a introduir el dia: ")
                dia = lector.nextInt()
            }
        }

    }while (dia < 1 || dia > 31)



    println("El teu dia de naixement es -> $BLUE_BOLD$dia$RESET")

    println("Has nascut el dia $BLUE_BOLD$dia/$mes/$any$RESET")

}