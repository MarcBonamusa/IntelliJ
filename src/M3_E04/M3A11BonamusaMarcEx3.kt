package M3_E04

/**
 *
 * Programa que demani un número enter major que 1 a l'usuari i digui si el nombre
 * és primer o no. Després, ens dirà quin és el nombre primer immediatament superior.
 *
 * @author Marc Bonamusa
 * @since 11/10/2024
 *
 **/

import utils.*
import java.util.*

fun main() {
    val lector: Scanner = Scanner (System.`in`)
    var primer: Int
    var esPrimer:Boolean = true
    var valorCorrecte: Boolean = false
    var seguir:String

    println("${GREEN_BOLD}Benvingut al programa dels numeros enters!$RESET")
    do {
        do {
            do {
                //Comprovem amb scanner que el valor introduit sigui un número enter
                print("Introdueix número enter major que 1: ")
                valorCorrecte = lector.hasNextInt()
                if (valorCorrecte == false) {
                    println("${RED_BOLD}ERROR: Introdueix un número$RESET")
                    lector.nextLine()
                }
            } while (valorCorrecte == false)
            primer  = lector.nextInt()
            lector.nextLine()

            //Si el número introduït per l'usuari és menor o igual a 1 mostrarà aquest error
            if (primer <= 1) {
                println("${YELLOW_BOLD}ERROR: El número que has introduït ha de ser major a 1$RESET")
            }

        } while (primer <= 1)

        // Comprovem si es un número primer
        var i:Int = 2
        while (i <= Math.sqrt(primer.toDouble()).toInt()) {
            if (primer % i == 0) {
                esPrimer = false
                break
            }
            i++
        }

        if (esPrimer) {
            println("${BLUE_BOLD}El número $primer SI és primer$RESET")
        } else {
            println("${YELLOW_BOLD}El número $primer NO és primer$RESET")
        }

        // Trobar el següent nombre primer
        var seguentPrimer = primer + 1
        while (true) {
            esPrimer = true
            i = 2
            while (i <= Math.sqrt(seguentPrimer.toDouble()).toInt()) {
                if (seguentPrimer % i == 0) {
                    esPrimer = false
                    break
                }
                i++
            }
            if (esPrimer) {
                println("${BLUE_BOLD}El primer número primer immediatament superior a $primer és el $seguentPrimer.$RESET")
                break
            }
            seguentPrimer++
        }

        // Preguntar si vol comprovar un altre número
        do {
            print("${GREEN_BOLD}Vols comprovar un altre número? (S/N): $RESET")
            seguir = lector.nextLine().uppercase()
        } while (seguir != "S" && seguir != "N")

    } while (seguir == "S")

    println("${RED_BOLD}Fi del programa. Gràcies per utilitzar-lo!$RESET")


}