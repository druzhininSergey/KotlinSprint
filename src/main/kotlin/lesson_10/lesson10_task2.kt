package lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPassword = readln()

    if (checkAmountOfSymbols(userLogin) && checkAmountOfSymbols(userPassword))
        println("Добро пожаловать")
    else println("Логин или пароль недостаточно длинные")
}

fun checkAmountOfSymbols(userInput: String): Boolean {
    return userInput.length >= 4
}