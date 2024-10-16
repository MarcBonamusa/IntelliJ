package M3_A05

fun main() {
    //Algoritme d'una aplicació que demana un número i
    // mostra per pantalla els números anterior i posterior a aquest.

    var num:Int

    println("Escriu un número")

    num = readln().toInt()

    println("El número anterior de $num es: " + (num - 1))
    println("El número posterior de $num es: " + (num + 1))
}