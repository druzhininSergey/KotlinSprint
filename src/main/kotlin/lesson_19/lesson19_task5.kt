package lesson_19

enum class Sex(val sexString: String) {
    MALE("мужчина"),
    FEMALE("женщина"),
}

class Person(val name: String, val sex: Sex)

fun main() {
    val cardCatalog = mutableListOf<Person>()
    println(
        "Для добавления человека в список введите его имя, затем пол (Мужчина или Женщина).\nВ формате:" +
                " \"Сергей, Мужчина\""
    )
    for (i in 1..5) {
        val input = readln().split(", ")
        if (input.size != 2) {
            println("Введены некорректные данные, попробуйте снова")
            continue
        }

        val (name, sexString) = input
        val sex = when (sexString.lowercase()) {
            "мужчина" -> Sex.MALE
            "женщина" -> Sex.FEMALE
            else -> {
                println("Введены некорректные данные")
                continue
            }
        }
        cardCatalog.add(Person(name, sex))
    }

    cardCatalog.forEach {
        println("Имя: ${it.name}, Пол: ${it.sex.sexString}")
    }
}