package lesson_7

fun main() {

    val symbolsForPassword = (1..9) + ('a'..'z') + ('A'..'Z')
    println(
        """Минимальное количество для создания пароля - 6
        |Введите количество символов для вашего пароля:
    """.trimMargin()
    )
    var randomPassword = ""
    val amountOfSymbolsForPassword = readln().toIntOrNull() ?: 0

    if (amountOfSymbolsForPassword in 0..6) {
        for (i in 1..6) {
            randomPassword += symbolsForPassword.random()
        }
    } else for (i in 1..amountOfSymbolsForPassword) {
        randomPassword += symbolsForPassword.random()
    }
    println(randomPassword)
}