
class User(
    val firstName: String,
    val lastName: String,
    val carDriver: Boolean,
    val carOwner: Boolean,
    val car: Car
) {

    fun sayYourName() {
        println("$firstName $lastName")
    }

    fun getInformationAboutYourCar() {
        car.sayCarsProperties()
    }
}

class Car(
    val color: String,
    val model: String,
    val price: Int,
    val speed: Int,
    var owner: User?
) {

    fun sayCarsProperties() {
        println("Модель '$model'")
        println("Цена '$price' рублей")
        println("Цвет = '$color'")
        println("Скорость '$speed' км/ч")
    }
}

fun getDefaultCar() = Car(
    color = "красный",
    model = "Lada",
    price = 300,
    speed = 60,
    owner = null
)