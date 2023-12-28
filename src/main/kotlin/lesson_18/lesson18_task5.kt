package lesson_18

abstract class Figure {
    abstract val figureName: String
}

class Circle(override val figureName: String = "Круг") : Figure()

class Square(override val figureName: String = "Квадрат") : Figure()

class Point(override val figureName: String = "Точка") : Figure()

class Screen {
    fun draw(coordinateX: Int, coordinateY: Int, figure: Figure) {
        println("Фигура \"${figure.figureName}\" на координатах X: $coordinateX, Y: $coordinateY")
    }

    fun draw(coordinateX: Float, coordinateY: Float, figure: Figure) {
        println("Фигура \"${figure.figureName}\" на координатах X: $coordinateX, Y: $coordinateY")
    }

    fun draw(coordinateX: Float, coordinateY: Int, figure: Figure) {
        println("Фигура \"${figure.figureName}\" на координатах X: $coordinateX, Y: $coordinateY")
    }

    fun draw(coordinateX: Int, coordinateY: Float, figure: Figure) {
        println("Фигура \"${figure.figureName}\" на координатах X: $coordinateX, Y: $coordinateY")
    }
}