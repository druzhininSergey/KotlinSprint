package lesson_1

fun main() {

    val totalSeconds = 6480

    val hours = "%02d".format(totalSeconds / 3600)
    val minutes = "%02d".format(totalSeconds % 3600 / 60)
    val seconds = "%02d".format(totalSeconds % 3600 % 60)

    println("$hours:$minutes:$seconds")
}