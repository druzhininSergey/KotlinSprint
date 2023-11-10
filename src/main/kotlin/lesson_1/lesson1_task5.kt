package lesson_1

fun main() {

    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val minutes = totalSeconds % 3600 / 60
    val seconds = totalSeconds % 3600 % 60

    println("0$hours:$minutes:0$seconds")
}