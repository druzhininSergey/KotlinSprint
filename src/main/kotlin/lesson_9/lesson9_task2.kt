package lesson_9

const val USER_YES_ANSWER = "да"

fun main() {

    val listOfIngredients = mutableListOf("вода", "соль", "мясо")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить еще?")
    val ifUserWantsToAdd = readln()

    if (ifUserWantsToAdd == USER_YES_ANSWER) {
        println("Какой ингредиент вы хотите добавить?")
        listOfIngredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    }
}