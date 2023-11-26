package lesson_9


fun main() {

    val arrayOfUserIngredients = emptySet<String>().toMutableSet()
    for (i in 1..5) {
        println("Введите $i-й ингредиент")
        arrayOfUserIngredients += readln()
    }
    val resultString = arrayOfUserIngredients.sorted().mapIndexed { index, ingredient ->
        if (index == 0) ingredient.capitalize() else ingredient
    }
        .joinToString(", ")
    println(resultString)
}