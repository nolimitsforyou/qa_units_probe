import kotlin.properties.Delegates

class User(
    firstName: String,
    lastName: String,
) {
    private val name = firstName
    private val family = lastName
    var profession: String? = null

    fun sayYourName() {
        println("$name $family")
    }

    fun sayYourProfession() {
        if (profession != null) {
            println(profession)
        } else {
            println("I have no profession")
        }
    }
}

class Car {

    lateinit var model: String
    var price by Delegates.notNull<Int>()
    lateinit var color: String
    var speed by Delegates.notNull<Int>()

    fun getDefaultCar(): Car {
        return Car().apply {
            model = "Lada"
            price = 300
            color = "красный"
            speed = 90
        }
    }

    fun sayCarsProperties(car: Car) {
        println("Модель = ${car.model}")
        println("Цена = ${car.price} рублей")
        println("Цвет = ${car.color}")
        println("Скорость = ${car.speed} км/ч")
    }
}