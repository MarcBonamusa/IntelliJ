package M3_A06

/**
 * @author: Marc Bonamusa
 */
fun main() {
    //Algoritme que demana l'edat, i mostra missatges diferents en funció de si s'és major d'edat o menor.

    println("Escriu la teva edat:")
    val edat = readln().toInt()
    if (edat < 18){
        println("Ets menor d'edat")
    } else {
        println("Ets mayor d'edat")
    }
}