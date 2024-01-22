package lesson_19

enum class Bullet(private val bulletDamage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);

    fun getBulletDamage(): Int = bulletDamage
}

class Tank {
    private var bulletCharged: Bullet? = null

    fun loadBulletInTank(bullet: Bullet) {
        bulletCharged = bullet
        println("Произведен заряд танка ${bullet.name} патроном.")
    }

    fun shoot() {
        if (bulletCharged == null) println("Танк разряжен. Перед выстрелом нужно зарядить")
        else {
            println("Произведен выстрел, нанесено ${bulletCharged!!.getBulletDamage()} урона.")
            bulletCharged = null
        }
    }
}

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.loadBulletInTank(Bullet.BLUE)
    tank.shoot()
    tank.shoot()
    tank.loadBulletInTank(Bullet.GREEN)
    tank.shoot()
    tank.loadBulletInTank(Bullet.RED)
    tank.shoot()
}