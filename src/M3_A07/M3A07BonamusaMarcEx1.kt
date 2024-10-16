package M3_A07

import utils.RED
import utils.RESET

/**
 * @author Marc Bonamusa
 * @since 4/10/2024
 *
 * Algoritme que mostra els números del 10 al 0, i al final, BOOOOOM!!
 **/

fun main() {
    for(i in 10 downTo 0 step 1)
        println("$i ")
    println("${RED}BOOOOOM!!$RESET")
}