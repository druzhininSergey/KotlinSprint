package lesson_9

fun main() {

    println("Напишите в одну строку 5 ингредиентов для блюда, разделяя их \", \"")
    val userIngredients = readln().split(", ").sorted().toMutableList()

    println(userIngredients)
}