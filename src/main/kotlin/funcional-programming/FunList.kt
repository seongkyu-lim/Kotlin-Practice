package `funcional-programming`

// 리스트 자료구조
sealed class FunList <out T> {
    object Nil : FunList<Nothing>()
    data class Cons<out T>(val head: T, val tail: FunList<T>): FunList<T>()
}

// List 맨 앞에 값을 추가하는 addHead 함수.
fun <T> FunList<T>.addHead(head: T): FunList<T> = FunList.Cons(head, this)

// 리스트의 마지막 값을 추가하는 appendTail 함수.
fun <T> FunList<T>.appendTail(value: T): FunList<T> = when (this) {
    FunList.Nil -> Cons(value, Nil)
    is FunList.Cons -> Cons(head, tail.appendTail(value))
}

// 꼬리 재귀로 작성한 appendTail 함수.
tailrec fun <T> FunList<T>.appendTail(value: T, acc: FunList<T> = Nil): FunList<T>
= when (this) {
            FunList.Nil -> Cons(value, acc).reverse()
    is FunList.Cons -> tail.appendTail(value, acc.addHead(head))
        }

// reverse 함수
tailrec fun <T> FunList<T>.reverse(acc: FunList<T> = FunList.Nil): FunList<T>
= when (this) {
    FunList.Nil -> acc
    is FunList.Cons -> tail.reverse(acc.addHead(head))
}

// 꼬리 리스트를 얻어오기 위한 getTail 함수
fun <T> FunList<T>.getTail(): FunList<T>
= when (this) {
    FunList.Nil -> throw NoSuchElementException()
    is FunList.Cons -> tail
}



fun main(args: Array<String>) {
    val list: FunList<Int> = Cons(1, Cons(2, Nil))
}

