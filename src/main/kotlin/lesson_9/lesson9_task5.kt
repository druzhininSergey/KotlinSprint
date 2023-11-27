package lesson_9


fun main() {

    val userIngredients = mutableSetOf<String>()
    for (i in 1..5) {
        println("Введите $i-й ингредиент")
        userIngredients += readln()
    }
    val resultString = userIngredients.sorted().joinToString(", ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    println(resultString)
}