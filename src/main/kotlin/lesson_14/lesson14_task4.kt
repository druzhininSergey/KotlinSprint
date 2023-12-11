package lesson_14

import java.util.*

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

    fun addSatellite(satellite: Satellite) {
        if (satellite.planetName == name) satelliteList.add(satellite)
    }

    fun printPlanetAndSatelliteInfo() {
        if (satelliteList.isNotEmpty()) {
            println("Планета $name имеет спутники:")
            for (i in satelliteList) {
                println(i.name)
            }
        } else println("Планета $name не имеет спутников.")
    }
}

class Satellite(
    name: String,
    isAtmosphereBreathable: Boolean,
    isSuitableForLanding: Boolean,
    var planetName: String = "",
) : CelestialBody(name, isAtmosphereBreathable, isSuitableForLanding) {

    init {
        planetName = attachToPlanet()
    }

    private fun attachToPlanet(): String {
        println("Напишите название планеты, которой принадлежит спутник $name")
        val planetToAttach = readln().trim().lowercase()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        return planetToAttach
    }
}

fun main() {
    val planetMars = Planet("Марс", false, true)
    val satellitePhobos = Satellite("Фобос", false, false)
    val satelliteDeimos = Satellite("Деймос", false, true)

    planetMars.addSatellite(satelliteDeimos)
    planetMars.addSatellite(satellitePhobos)
    planetMars.printPlanetAndSatelliteInfo()
}
