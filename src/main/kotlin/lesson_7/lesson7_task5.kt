package lesson_7

fun main() {

    val symbolsForPassword = (1..9) + ('a'..'z') + ('A'..'Z')
    println(
        """Минимальное количество для создания пароля - 6
        |Введите количество символов для вашего пароля:
    """.trimMargin()
    )
    var randomPassword = ""
    var amountOfSymbolsForPassword = readln().toIntOrNull() ?: 0

    while (amountOfSymbolsForPassword in 0..5) {
        println("Пожалуйста, введите число символов для пароля от 6 и более")
        amountOfSymbolsForPassword = readln().toIntOrNull() ?: 0
    }
    for (i in 1..amountOfSymbolsForPassword) randomPassword += symbolsForPassword.random()
    println(randomPassword)
}