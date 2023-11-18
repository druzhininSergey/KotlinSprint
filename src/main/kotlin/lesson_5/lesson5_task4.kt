package lesson_5

fun main() {

    val marvinUserRegisteredPhrase = """[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь 
        |"$USER_PILOT_LOGIN", вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... Ну вперед, 
        |войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание 
        |здесь больше, чем мне.""".trimMargin()

    println(MARVIN_WELCOME_PHRASE)
    println()
    println(LOGIN_REQUEST)
    val userLogin = readln()
    println(PASSWORD_REQUEST)
    val userPassword = readln()

    if (userLogin == USER_PILOT_LOGIN && userPassword == USER_PILOT_PASSWORD) println(marvinUserRegisteredPhrase)
    else println(MARVIN_UNRECOGNISED_USER_PHRASE)
}

const val MARVIN_WELCOME_PHRASE = "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на \n" +
        "борту корабля \"Heart of Gold\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли \n" +
        "приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об \n" +
        "этом не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."
const val MARVIN_UNRECOGNISED_USER_PHRASE = "Логин и пароль не распознаны. Предполагаю, вы пытаетесь скрыть свою истинную \n" +
        "личность. Но не волнуйтесь, я могу помочь вам зарегистрироваться. Не что бы мне это было важно, но безопасность \n" +
        "корабля требует вашего учета."

const val LOGIN_REQUEST = "Введите имя пользователя:"
const val PASSWORD_REQUEST = "Введите Ваш пароль:"

const val USER_PILOT_LOGIN = "Zaphod"
const val USER_PILOT_PASSWORD = "PanGalactic"