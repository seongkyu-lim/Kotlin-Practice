package function


/*
function

named arguments
- if you call function with named arguments, you can call function with any order arguments.

default arguments
- you can declare default value of arguments and it can be omitted.

function without return (void in java)

single-expression functions

- if there are no body in function, culry braces can be omitted and = can be used.


lambda expressions

for example .filter, .map


 */
fun main(){
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}