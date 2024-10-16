package M3_A06

import utils.RED_BOLD
import utils.RESET

/**
 * @author: Marc Bonamusa
 */
fun main() {
    //Algoritme que demana un número entre 0 i 10, i dona error si és menor de 0 o major de 10.

    var num:Int

    println("Escriu un numero entre el 0 i el 10:")
    num = readln().toInt()
    if (num > 10 || num < 0){
        println("${RED_BOLD}Error${RESET}")
    } else {
        println("Has introduit el número bé!")
    }
}