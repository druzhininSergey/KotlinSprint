package lesson_8

fun main() {

    val arrayOfIngredientsForPilaf = arrayOf(
        "картошка", "вода", "приправы для супа", "сало", "лук", "колбаса", "мясо"
    )
    println("Напишите наименование ингредиента, который вы хотите найти в рецепте от Иришки")
    val userIngredientSearch = readln()

    if (userIngredientSearch in arrayOfIngredientsForPilaf) println("Ингредиент $userIngredientSearch в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}