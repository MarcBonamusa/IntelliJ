package M3_E04

fun main() {
    var num = readln().toInt()
    var esPrimer:Boolean = true

    var i:Int = 2
    do {
        if((num % i) == 0) esPrimer = false
        else i++
    } while (i < num && esPrimer)

    println("El numero $num es $esPrimer que sigui primer")
}