package lesson_9

fun main() {

    val listOfQuantityOfIngredients = mutableListOf(2, 50, 15)
    println("Сколько порций амлета вы хотите приготовить?")
    val numberOfServings = readln().toIntOrNull() ?: 0

    val userRequestQuantityOfIngredients = listOfQuantityOfIngredients.map {
        it * numberOfServings
    }
    println(
        "На $numberOfServings порций вам понадобится: Яиц: ${userRequestQuantityOfIngredients[0]} шт, " +
                "молока: ${userRequestQuantityOfIngredients[1]} мл, сливочного масла: ${userRequestQuantityOfIngredients[2]} мл"
    )
}