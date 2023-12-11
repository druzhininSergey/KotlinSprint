package lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

    companion object {
        fun calculateSumByColor(list: MutableList<Figure>, color: String): Pair<Double, Double> {
            val areaList = mutableListOf<Double>()
            val perimeterList = mutableListOf<Double>()
            for (i in list) {
                if (i.color == color) {
                    areaList.add(i.calculateArea())
                    perimeterList.add(i.calculatePerimeter())
                }
            }
            return areaList.sum() to perimeterList.sum()
        }
    }
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

    val (whiteAreaList, whitePerimeterList) = Figure.calculateSumByColor(figuresList, "Белый")
    val (blackAreaList, blackPerimeterList) = Figure.calculateSumByColor(figuresList, "Черный")

    println("Сумма площадей белых фигур = ${"%.1f".format(whiteAreaList)}")
    println("Сумма периметров белых фигур = ${"%.1f".format(whitePerimeterList)}")
    println("Сумма площадей черных фигур = ${"%.1f".format(blackAreaList)}")
    println("Сумма периметров черных фигур = ${"%.1f".format(blackPerimeterList)}")
}