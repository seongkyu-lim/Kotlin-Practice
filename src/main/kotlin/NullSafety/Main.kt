package NullSafety

fun main() {
    /*

    1. compile 시점에서  null이 아니도록 강제하고 null일 가능성을 체크한다. (nullable types)
    2. null일 가능성이 있더라도 safe하게 null을 반환하거나 elvis연산자로  null일 경우 의도하는 값 반환하도록 할 수 있음. (safe call)

    */

    // 1.
    var neverNull: String = "never null"

    var nullable: String? = "can be null"

    // neverNull e null; -> error.
    nullable = null

    // 2.
    fun lengthString(mabeString: String?): Int? = mabeString?.length
    fun lengthstringWithElvis(mabeString: String?): Int? = mabeString?.length ?: 0

    var nullString: String? = null
    println(lengthString(nullString)) // null.length를 호출했지만 NPE 발생하지 않고 null 반환.
    println(lengthstringWithElvis(nullString)) // null일 경우 의도한 0 반환.




}