package lesson_8

fun main() {

    println("Укажите какое количество ингредиентов вы хотите добавить в список:")
    val userAmountOfIngredients = readln().toIntOrNull() ?: 0
    val arrayOfIngredients = arrayOfNulls<String>(userAmountOfIngredients)

    for (i in 0..<userAmountOfIngredients) {
        println("Введите ${i + 1}-й ингредиент")
        arrayOfIngredients[i] = readln()
    }
    println("Ваш новый список ингредиентов:")
    for (i in arrayOfIngredients) {
        println("Ингредиент № ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}