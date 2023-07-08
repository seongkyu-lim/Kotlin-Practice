

fun main() {
    /*
    List
     */

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