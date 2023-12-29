package lesson_19

fun main() {
    println("Вы можете добавить в аквариум следующих рыбок:")
    for (i in Fish.entries){   // Среда разработки предлагает использование entries взамен values()
        println(i.getFishName())
    }
}

enum class Fish{
    GUPPY() {
        override fun getFishName(): String {
            return "Гуппи"
        }
    },
    ANGEL_FISH() {
        override fun getFishName(): String {
           return "Скалярия"
        }
    },
    GOLDEN_FISH() {
        override fun getFishName(): String {
            return "Золотая рыбка"
        }
    },
    SIAMESE_FIGHTING_FISH() {
        override fun getFishName(): String {
            return "Петушок"
        }
    };

    abstract fun getFishName() : String
}