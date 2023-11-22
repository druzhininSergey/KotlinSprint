package lesson_8

fun main() {

    var arrayOfIngredients = emptyArray<String>()
    println("Укажите какое количество ингредиентов вы хотите добавить в список:")
    val userAmountOfIngredients = readln().toIntOrNull() ?: 0

    for (i in 0 until userAmountOfIngredients) {
        println("Введите ${i + 1}-й ингредиент")
        val ingredientToAdd = readln()
        arrayOfIngredients += ingredientToAdd
    }
    println("Ваш новый список ингредиентов:")
    for (i in arrayOfIngredients) {
        println("Ингредиент № ${arrayOfIngredients.indexOf(i)+1}: $i")
    }
}