package lesson_7

fun main() {

    val rangeOfAuthorizationNumbers = 1000..9999

    for (i in 1..1000) {
        val authorizationNumber = rangeOfAuthorizationNumbers.random()
        println("Ваш код авторизации: $authorizationNumber")
        println("Введите код авторизации:")
        val userAuthorizationNumber = readln().toIntOrNull() ?: 0
        if (userAuthorizationNumber == authorizationNumber) {
            println("Доступ разрешен")
            break
        } else println("Введен неверный код авторизации, попробуйте снова.")
    }
}