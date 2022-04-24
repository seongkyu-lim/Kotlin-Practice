package `class`

fun main() {
    val basic: Basic = Basic("seongkyu", 25)

    // custom getter
    var rectangle = Rectangle(3, 2)
    println(rectangle.area)

    // custom setter
    rectangle.area = 4
    println(rectangle.area)
}

class Basic constructor(
    private val name: String,
    val age: Int
) {
    val seongkyuname = ("hey : " + name).also(::println)
}

class Rectangle(val width: Int, val height: Int) {
    var area: Int = 0
        get() = this.width * this.height
        set(value) {
            field = value
        }
}
