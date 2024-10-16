package M3_A07

/**
 * @author Marc Bonamusa
 * @since 4/10/2024
 *
 * Algoritme que demana un número i mostra per pantalla la seva taula de multiplicar.
 **/

fun main() {
    print("Escriu una numero per fer la seva taula de multiplicar: ")
    val numero = readln().toInt()

    for (i in 1..10) {
        var resultado = i * numero
        println("$numero * $i = $resultado")
    }
}