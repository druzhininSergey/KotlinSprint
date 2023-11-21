package lesson_8

fun main() {

    val arrayOfIngredientsForPilaf = arrayOf(
        "картошка", "вода", "приправы для супа", "сало", "лук", "колбаса", "мясо"
    )
    for (i in 0..arrayOfIngredientsForPilaf.lastIndex){
        println("Ингредиент № ${i + 1}: ${arrayOfIngredientsForPilaf[i]}")
    }
    println("Какой ингредиент вы желаете заменить?")
    val userRequestToModifyArray = readln()

    if (userRequestToModifyArray in arrayOfIngredientsForPilaf) {
        println("Что бы вы хотели использовать вместо $userRequestToModifyArray?")
        val changeArrayUnit = readln()
        val indexOfIngredient: Int = arrayOfIngredientsForPilaf.indexOf(userRequestToModifyArray)
        arrayOfIngredientsForPilaf.set(indexOfIngredient, changeArrayUnit)
        println("Ваш новый измененный список ингредиентов:\n${arrayOfIngredientsForPilaf.joinToString(", ")}")
    }
    else println("Введенный ингредиент отсутствует в списке")
}