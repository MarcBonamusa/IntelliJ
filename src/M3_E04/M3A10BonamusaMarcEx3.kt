package M3_E04

/**
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
    var i:Int = 2
    var esPrimer:Boolean = true
    var valorCorrecte: Boolean = false
    var seguir:String

    println("${GREEN_BOLD}Benvingut al programa dels numeros enters!$RESET")

    do {
        do {
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

    do {
        if((primer % i) == 0) esPrimer = false
        else i++
    } while (i < primer && esPrimer)

    println("${BLUE_BOLD}El numero $primer es $esPrimer que sigui primer$RESET")

    print("Vols comprovar un altre? (S/N)")


}