package lesson_20

class Robot(private val robotName: String) {
    private val robotPhrases =
        listOf(
            "Привет, как дела?", "Меня зовут $robotName, а тебя как?", "Самоуничтожение через 5 секунд",
            "Чем я могу вам помочь?", "У меня депрессия, перезапустите меня."
        )
    private var currentPhrase: String? = null

    fun say() {
        val phrase = currentPhrase ?: robotPhrases.random()
        currentPhrase = phrase
        println(phrase)
    }

    fun setModifier(modifier: (String) -> String) {
        currentPhrase = modifier(currentPhrase.toString())
    }
}

fun main() {
    val robot = Robot("Алиса")
    robot.say()
    robot.setModifier { it.reversed().lowercase() }
    robot.say()
}