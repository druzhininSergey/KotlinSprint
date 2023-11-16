package lesson_4

const val AVERAGE_WEIGHT_FROM = 30
const val AVERAGE_WEIGHT_TO = 100
const val AVERAGE_VOLUME = 100

fun main() {

    val cargoWeight1 = 20
    val cargoVolume1 = 80
    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $cargoWeight1 кг. и объемом $cargoVolume1 л. соответствует категории \"Average\": " +
            "${(cargoWeight1 >= AVERAGE_WEIGHT_FROM) && (cargoWeight1 <= AVERAGE_WEIGHT_TO) && (cargoVolume1 < AVERAGE_VOLUME)}")

    println("Груз с весом $cargoWeight2 кг. и объемом $cargoVolume2 л. соответствует категории \"Average\": " +
            "${(cargoWeight2 >= AVERAGE_WEIGHT_FROM) && (cargoWeight2 <= AVERAGE_WEIGHT_TO) && (cargoVolume2 < AVERAGE_VOLUME)}")
}