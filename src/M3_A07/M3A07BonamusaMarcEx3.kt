package M3_A07

/**
 * @author Marc Bonamusa
 * @since 4/10/2024
 *
 * Algoritme que demana l'edat i mostra els anys que aquest ha anat complint (1, 2, 3...).
 **/

fun main() {
    print("Escriu la teva edat: ")
    val edat = readln().toInt()
    for(i in 1..edat)
        println("$i anys")
}