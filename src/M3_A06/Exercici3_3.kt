package M3_A06

import utils.RED
import utils.RESET
import utils.YELLOW

/**
 * @author: Marc Bonamusa
 */
fun main() {
    //Algoritme que demana una nota entre 0 i 10, i mostra si és un aprovat o un suspès.

    var nota:Float

    print("Escriu la teva nota: ")
    nota = readln().toFloat()
    if (nota < 5 ){
        println("${RED}Has suespès tens un: $nota $RESET")
    } else {
        println("${YELLOW}Has aprovat tens un: $nota! $RESET")
    }
}