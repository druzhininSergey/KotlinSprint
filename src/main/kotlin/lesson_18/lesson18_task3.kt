package lesson_18

abstract class TamagotchiPets {
    abstract val petName: String
    fun play() = println("$petName - играет.")
    fun sleep() = println("$petName - спит.")
    abstract fun eat()
}

class Fox() : TamagotchiPets() {
    override val petName = "Рыжая"
    override fun eat() {
        println("$petName - ест ягоды.")
    }
}

class Dog() : TamagotchiPets() {
    override val petName = "Бим"
    override fun eat() {
        println("$petName - ест кости.")
    }
}

class Cat() : TamagotchiPets() {
    override val petName = "Муся"
    override fun eat() {
        println("$petName - ест рыбу.")
    }
}

fun main() {
    val fox: TamagotchiPets = Fox()
    val dog: TamagotchiPets = Dog()
    val cat: TamagotchiPets = Cat()
    fox.play()
    dog.eat()
    cat.sleep()
}
