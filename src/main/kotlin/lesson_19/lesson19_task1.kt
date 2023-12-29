package lesson_19

fun main() {
    println("Вы можете добавить в аквариум следующих рыбок:")
    for (i in Fish.entries){   // Среда разработки предлагает использование entries взамен values()
        println(i.printFishName())
    }
}

enum class Fish{
    GUPPY() {
        override fun printFishName(): String {
            return "Гуппи"
        }
    },
    ANGEL_FISH() {
        override fun printFishName(): String {
           return "Скалярия"
        }
    },
    GOLDEN_FISH() {
        override fun printFishName(): String {
            return "Золотая рыбка"
        }
    },
    SIAMESE_FIGHTING_FISH() {
        override fun printFishName(): String {
            return "Петушок"
        }
    };

    abstract fun printFishName() : String
}