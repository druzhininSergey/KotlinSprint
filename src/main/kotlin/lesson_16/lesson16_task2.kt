package lesson_16

private const val PI: Double = 3.14

class Circle(
    private val radius: Double,
) {
    fun calculateCircleLength(): Double {
        val circleLength = 2 * PI * radius
        println("Длина окружности, радиусом $radius, равна: $circleLength")
        return circleLength
    }

    fun calculateCircleArea(): Double {
        val circleArea = PI * radius * radius
        println("Площадь круга, радиусом $radius, равна: $circleArea")
        return circleArea
    }
}

fun main() {
    val circle = Circle(2.0)
    circle.calculateCircleArea()
    circle.calculateCircleLength()
}