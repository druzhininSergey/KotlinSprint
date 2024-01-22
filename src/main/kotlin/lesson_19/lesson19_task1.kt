package lesson_19

fun main() {
    println("Вы можете добавить в аквариум следующих рыбок:")
    for (i in Fish.entries) println(i.fishName)
}

enum class Fish(val fishName: String) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLDEN_FISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}