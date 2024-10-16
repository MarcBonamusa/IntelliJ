package M3_A06

/**
 * @author: Marc Bonamusa
 */
fun main() {
    //Algoritme que demana una nota entre 0 i 10, i mostra si és un
    // suspès (0-4), un suficient (5), un bé (6), un notable (7-8) o un excel·lent (9-10).
    var nota: Int

    do {
        print("Escriu la teva nota del examen: ")
        nota = readln().toInt()
        when (nota) {
            0, 1, 2, 3, 4 -> println("Tens un insuficient")
            5 -> println("Tens un suficient")
            6 -> println("Tens un bé")
            7, 8 -> println("Tens un notable")
            9, 10 -> println("Tens un excel·lent")
            else -> println("Nota no valida")
        }
    } while (nota < 0 || nota > 10)
}