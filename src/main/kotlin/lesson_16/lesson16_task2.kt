package lesson_16

class Circle(
    private val radius: Double,
) {
    private val pi: Double = 3.14

    fun calculateCircleLength(): Double {
        val circleLength = 2 * pi * radius
        println("Длина окружности, радиусом $radius равна: $circleLength")
        return circleLength
    }

    fun calculateCircleArea(): Double {
        val circleArea = pi * radius * radius
        println("Площадь круга, радиусом $radius равна: $circleArea")
        return circleArea
    }
}

fun main() {
    val circle = Circle(2.0)
    circle.calculateCircleArea()
    circle.calculateCircleLength()
}