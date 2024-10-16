package M3_A07

/**
 * @author Marc Bonamusa
 * @since 4/10/2024
 *
 * Algoritme que demana una paraula a l'usuari i la mostra 100 vegades.
 **/

fun main() {
    print("Escriu una paraula que es mostrarà 100 vegades: ")
    val paraula = readln().toString()
    for(i in 1..100)
        println("$i $paraula")
}