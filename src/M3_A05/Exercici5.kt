package M3_A05

/**
 * @author: Marc Bonamusa
 */
fun main() {

    //Algoritme que demana les dades d'una piscina i mostra el volum en metres cúbics i en litres d'aigua.

    var amplada:Float
    var llarg:Float
    var fondaria:Float
    var volum:Float
    var litres:Float

    println("Escriu la amplada de la piscina")
    amplada = readln().toFloat()

    println("Escriu el llarg de la piscina")
    llarg = readln().toFloat()

    println("Escriu la fondària de la piscina")
    fondaria = readln().toFloat()

    volum = amplada * llarg * fondaria
    litres = volum * 1000

    println("El volum es de $volum metres cúbics")
    println("Dins de la piscina hi ha $litres litres d'aigua")
}