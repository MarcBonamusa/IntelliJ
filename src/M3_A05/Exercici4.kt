package M3_A05

fun main() {
    //Algoritme que demana un preu en € i el torna en £.

    var preu:Float

    println("Escriu un preu en euros per fer la conversió a lliures")
    preu = readln().toFloat()

    println("El resultat de la conversió de euros a lliures es de: " + (preu * 0.83))

}