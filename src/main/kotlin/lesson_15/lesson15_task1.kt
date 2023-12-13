package lesson_15

interface Flying {
    fun takeOff() {
        println("Взлететь")
    }

    fun land() {
        println("Приземлиться")
    }

    fun fly() {
        println("Лететь")
    }

    fun startRunning() {
        println("Бежать")
    }
}

interface Swimming {
    fun swim()
    fun swimOnSurfaceOfWater()
    fun dive()
    fun emerge()
}

class Carp : Swimming {

    override fun swim() {
        println("Плыть")
    }

    override fun swimOnSurfaceOfWater() {
        println("Плыть на поверхности")
    }

    override fun dive() {
        println("Погрузиться глубже")
    }

    override fun emerge() {
        println("Всплыть")
    }
}

class Gull : Flying, Swimming {
    override fun swim() {
        println("Плыть")
    }

    override fun swimOnSurfaceOfWater() {
        println("Плавать на поверхности воды")
    }

    override fun dive() {
        println("Погрузиться под воду")
    }

    override fun emerge() {
        println("Выплыть на поверхность воды")
    }
}

class Duck : Flying {
}

fun main() {
    val carp = Carp()
    val gull = Gull()
    val duck = Duck()
    carp.swim()
    carp.dive()
    gull.dive()
    gull.takeOff()
    duck.land()
    duck.startRunning()
}