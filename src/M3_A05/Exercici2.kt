package M3_A05

fun main() {
    //Algoritme que demana dos números i mostra el resultat de la suma,
    // la resta, la multiplicació i la divisió d'ells dos.

    var num1:Int
    var num2:Int

    println("Escriu el primer número per fer les operacions")
    num1 = readln().toInt()

    println("Escriu el segon número per fer les operacions")
    num2 = readln().toInt()

    println("El resultat de la suma entre els números es de: " + (num1 + num2))
    println("El resultat de la resta entre els números es de: " + (num1 - num2))
    println("El resultat de la multiplicació entre els números es de: " + (num1 * num2))
    println("El resultat de la divisió entre els números es de: " + (num1 / num2))

}