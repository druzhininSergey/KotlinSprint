package lesson_17

class Quiz() {
    val question = "Какое сегодня число?"
        get() = field
    var answer = "25 декабря"
        get() = field
        set(value) {
            field = value
        }
}

