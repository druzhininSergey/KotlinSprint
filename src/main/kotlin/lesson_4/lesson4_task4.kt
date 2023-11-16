package lesson_4

fun main() {

    val dayNumber = 5

    val armsExercises = dayNumber % 2 == 1
    val legsExercises = dayNumber % 2 == 0
    val backExercises = dayNumber % 2 == 0
    val absExercises = dayNumber % 2 == 1

    println("""
        Упражнения для рук:    $armsExercises
        Упраждения для ног:   $legsExercises
        Упражнения для спины: $backExercises
        Упражнения для пресса  $absExercises
    """.trimIndent())
}