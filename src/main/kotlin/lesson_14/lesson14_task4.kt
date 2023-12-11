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

    fun addSatellite(satellite: Satellite) = satelliteList.add(satellite)

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
    var belongsToPlanet: String,
) : CelestialBody(name, isAtmosphereBreathable, isSuitableForLanding)

fun main() {
    val listOfPlanets = mutableListOf<Planet>()
    val listOfSatellite = mutableListOf<Satellite>()

    val planetMars = Planet("Марс", false, true)
    listOfPlanets.add(planetMars)

    val satellitePhobos = Satellite("Фобос", false, false, "Марс")
    val satelliteDeimos = Satellite("Деймос", false, true, "Марс")
    listOfSatellite.add(satelliteDeimos)
    listOfSatellite.add(satellitePhobos)

    for (satellite in listOfSatellite) {
        for (planet in listOfPlanets) {
            if (satellite.belongsToPlanet == planet.name) {
                planet.addSatellite(satellite)
            }
        }
    }

    planetMars.printPlanetAndSatelliteInfo()
}
