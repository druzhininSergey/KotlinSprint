package lesson_21

fun Map<String, Int>.maxCategory(): String? {
    val mostUpgradedSkills = entries.groupBy { it.value }.maxByOrNull { it.key }
    return mostUpgradedSkills?.value?.random()?.key
}

fun main() {
    val skills = mapOf(
        "Сало" to 50,
        "Стан" to 60,
        "Лечение" to 60,
    )
    println("Наибольшее количество очков опыта у способности : \"${skills.maxCategory()}\"")
}