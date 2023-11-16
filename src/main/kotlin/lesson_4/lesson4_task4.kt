package lesson_4

fun main() {

    val dayNumber = 5
    val isDayEven = dayNumber % 2 == 0
    val isDayOdd = dayNumber % 2 != 0

    val armsExercises = isDayOdd
    val legsExercises = isDayEven
    val backExercises = isDayEven
    val absExercises = isDayOdd

    println(
        """
        Упражнения для рук:    $armsExercises
        Упражнения для ног:   $legsExercises
        Упражнения для спины: $backExercises
        Упражнения для пресса  $absExercises
    """.trimIndent()
    )
}