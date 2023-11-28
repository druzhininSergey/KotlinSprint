package lesson_8

fun main() {

    println("Укажите какое количество ингредиентов вы хотите добавить, \nзатем укажите какие ингредиенты включить в список?")
    val userAmountOfIngredients = Array(readln().toIntOrNull() ?: 0) { readln() }

    println("Ваш новый список ингредиентов:")
    for (i in userAmountOfIngredients) {
        println("Ингредиент № ${userAmountOfIngredients.indexOf(i) + 1}: $i")
    }
}
