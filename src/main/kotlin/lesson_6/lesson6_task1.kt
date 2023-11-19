package lesson_6

fun main() {

    println("Регистрация аккаунта.\nВведите имя пользователя:")
    val newUserLogin = readln()
    println("Введите пароль:")
    val newUserPassword = readln()
    println("Регистрация прошла успешно.")

    do {
        println("Для входа в аккаунт, введите Ваш логин:")
        val checkUserLogin = readln()
        println("Введите пароль:")
        val checkUserPassword = readln()
    } while (checkUserLogin != newUserLogin || checkUserPassword != newUserPassword)
    println("Авторизация прошла успешно")
}