package lesson_8

fun main() {

    val arrayOfIngredientsForPilaf = arrayOf(
        "укроп", "кошачья жопа", "25 картошек", "17 мандавошек", "ведро воды", "хрен", "охапка дров"
    )
    println("Напишите наименование ингредиента, который вы хотите найти в рецепте")
    val userIngredientSearch = readln()

    for (i in arrayOfIngredientsForPilaf) {
        if (userIngredientSearch in arrayOfIngredientsForPilaf) {
            println("Ингредиент $userIngredientSearch в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}