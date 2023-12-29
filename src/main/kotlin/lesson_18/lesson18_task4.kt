package lesson_18

abstract class Cargo(
    private val width: Double,
    private val length: Double,
    private val height: Double,
) {
    fun calculateArea(): Double {
        val area = 2 * (width * length + width * height + length * height)
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
    side: Double,
) : Cargo(side, side, side)
