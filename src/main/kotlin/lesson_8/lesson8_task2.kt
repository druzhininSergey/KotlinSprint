package lesson_8

fun main() {

    val arrayOfIngredientsForPilaf = arrayOf(
        "укроп", "кошачья жопа", "25 картошек", "17 мандавошек", "ведро воды", "хрен", "охапка дров"
    )
    println("Напишите наименование ингредиента, который вы хотите найти в рецепте")
    val userIngredientSearch = readln()
    var ingredientInArray = false

    for (i in 0..arrayOfIngredientsForPilaf.lastIndex) {
        if (userIngredientSearch == arrayOfIngredientsForPilaf[i]) {
            ingredientInArray = true
            println("Ингредиент $userIngredientSearch в рецепте есть")
            break
        }
    }
    if (ingredientInArray != true) println("Такого ингредиента в рецепте нет")
}