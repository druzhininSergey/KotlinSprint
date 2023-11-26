package lesson_9

fun main() {

    val listOfIngredients = listOf("соль", "вода", "перец", "мясо")
    println("В рецепте есть следующие ингредиенты: $listOfIngredients")
    listOfIngredients.forEach {
        println(it)
    }
}