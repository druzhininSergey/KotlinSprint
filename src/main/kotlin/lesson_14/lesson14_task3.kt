package lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

}

class Circle(
    color: String,
    private val radius: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        val area = PI * radius * radius
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = 2 * radius * PI
        return perimeter
    }
}

class Rectangle(
    color: String,
    private val width: Double,
    private val length: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        val area = width * length
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = 2 * (width + length)
        return perimeter
    }
}

fun main() {
    val circle1 = Circle("Белый", 10.0)
    val circle2 = Circle("Черный", 15.4)
    val rectangle1 = Rectangle("Белый", 20.0, 10.0)
    val rectangle2 = Rectangle("Черный", 30.2, 28.8)

    val figuresList = mutableListOf(circle1, circle2, rectangle1, rectangle2)
    val whiteAreaList = mutableListOf<Double>()
    val whitePerimeterList = mutableListOf<Double>()
    val blackAreaList = mutableListOf<Double>()
    val blackPerimeterList = mutableListOf<Double>()

    for (i in figuresList) {
        if (i.color == "Белый") {
            whiteAreaList.add(i.calculateArea())
            whitePerimeterList.add(i.calculatePerimeter())
        } else if (i.color == "Черный") {
            blackAreaList.add(i.calculateArea())
            blackPerimeterList.add(i.calculatePerimeter())
        }
    }
    println("Сумма площадей белых фигур = ${"%.1f".format(whiteAreaList.sum())}")
    println("Сумма периметров белых фигур = ${"%.1f".format(whitePerimeterList.sum())}")
    println("Сумма площадей черных фигур = ${"%.1f".format(blackAreaList.sum())}")
    println("Сумма периметров черных фигур = ${"%.1f".format(blackPerimeterList.sum())}")
}