package lesson_9

fun main() {

    println("Напишите в одну строку 5 ингредиентов для блюда, разделяя их \", \"")
    val userIngredients = readln()

    val arrayOfUserIngredients = userIngredients.split(", ").toMutableList()
    val sortedListOfIngredients = arrayOfUserIngredients.sorted()
    println(sortedListOfIngredients)
}