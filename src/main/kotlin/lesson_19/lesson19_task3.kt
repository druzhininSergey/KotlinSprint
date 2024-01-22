package lesson_19

class SpaceShip {
    fun takeOff() {
        TODO("Дописать логику")
    }

    fun land(): Unit = throw NotImplementedError()
    fun shootAsteroid() {
        println("Стрелять в астероид")
    }
}

fun main() {
    val spaceShip = SpaceShip()
    spaceShip.shootAsteroid()
    spaceShip.takeOff()
    spaceShip.land()
}