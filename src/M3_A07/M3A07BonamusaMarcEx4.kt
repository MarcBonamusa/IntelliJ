package M3_A07

/**
 * @author Marc Bonamusa
 * @since 4/10/2024
 *
 * Algoritme que demana una paraula a l'usuari i la mostra 100 vegades.
 **/

fun main() {
    print("Escriu una numero que es mostrarà seqüencialment des d'aquest número fins al 0: ")
    val numero = readln().toInt()
    for(i in numero downTo 0 step 1)
        println("$i ")
}