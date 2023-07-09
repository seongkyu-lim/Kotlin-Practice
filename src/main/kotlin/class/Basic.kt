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
/*
kotlin에서는 pranthesis 안에도 멤버변수들 선언할 수 있다.

new Keyword 없이 instance 생성 가능.

constructor, data classes.



 */
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
