package controlFlow

fun main() {
    /*
    if -else

    kotlin에는 3항 연산자가 없다.
    3항 연산자 대신 if else 활용.
     */
    val d: Int
    val check = true

    d = if (check) 1 else 2
    println(d)

    /*
    when (switch)

    when is useful for matching a variable, checking chain of Boolean expressions.
     */
    val obj = "hello"

    when (obj) {
        "1" -> println("One")
        "hello" -> println("Greeting")
        else -> println("Unknown")
    }

    /*
    Loops

    for - for range
    while - until a particular condition is satisfied.
     */

    for (number in 1..5) {
        print(number)
    }

    val cakes = listOf("carrot", "chees", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    var cakesEaton = 0
    while (cakesEaton < 3) {
        println("Eat a cake")
        cakesEaton++
    }


}