package collection

fun main() {
    /*
    List
     */

    val fruitList = mutableListOf<String>("apple", "banana", "melon")
    fruitList.forEach{
        fruit ->
        val newFruit = "hi $fruit"
        fruitList[fruitList.indexOf(fruit)] = newFruit
    }
    println(fruitList)

    /*
    Set
    set is unOrdered (cannot indexed.) and unique.
     */
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    val fruit: MutableSet<String> = mutableSetOf<String>("apple", "banana", "cherry")
    print(readOnlyFruit);

    /*
    Map
     */
    val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)
    val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
    print(readOnlyAccountBalances)
}