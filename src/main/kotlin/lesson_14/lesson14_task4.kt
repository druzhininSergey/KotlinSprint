package lesson_14

open class CelestialBody(
    val name: String,
    val isAtmosphereBreathable: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    name: String,
    isAtmosphereBreathable: Boolean,
    isSuitableForLanding: Boolean,
    val satelliteList: MutableList<Satellite> = mutableListOf(),
) : CelestialBody(name, isSuitableForLanding, isAtmosphereBreathable) {

    fun addSatellite(list: List<Satellite>) = satelliteList.addAll(list)

    fun printPlanetAndSatelliteInfo() {
        println("Планета $name имеет спутники:")
        for (i in satelliteList) {
            println(i.name)
        }
    }
}

class Satellite(
    name: String,
    isAtmosphereBreathable: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, isAtmosphereBreathable, isSuitableForLanding)

fun main() {
    val planetMars = Planet("Марс", false, true)
    val listOfMarsSatellite = listOf(
        Satellite("Фобос", false, false),
        Satellite("Деймос", false, true)
    )
    planetMars.addSatellite(listOfMarsSatellite)
    planetMars.printPlanetAndSatelliteInfo()
}