package lesson_2

fun main () {

    val crystalOre = 7
    val metalOre = 11
    val buff = 0.2

    val bonusCrystal = crystalOre * buff
    val bonusMetal = metalOre * buff

    println(bonusCrystal.toInt())
    println(bonusMetal.toInt())
}