package lesson_18

abstract class Cargo(
    private val width: Double,
    private val length: Double,
    private val height: Double,
) {
    fun calculateArea(): Double {
        val area = width * length
        println("Площадь поверхности посылки равна: $area")
        return area
    }
}

class RectangleBox(
    width: Double,
    length: Double,
    height: Double,
) : Cargo(width, length, height)

class CubeBox(
    width: Double,
    length: Double = width,
    height: Double = width,
) : Cargo(width, length, height)
