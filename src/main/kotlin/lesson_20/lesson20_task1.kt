package lesson_20

fun main() {
    val userName = "User"
    val happyNewYear: (String) -> String = { userName1: String -> "С наступающим Новым Годом, $userName1." }
    println(happyNewYear(userName))
}