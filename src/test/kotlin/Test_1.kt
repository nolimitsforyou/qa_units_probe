import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test

class Test_1 {

    @Test
    fun fst() {

        val car = Car().getDefaultCar()

        assertTrue(car.color != "зелёный")

        val car_2 = Car()
        val color = car_2.color

        car_2.sayCarsProperties(car_2)
    }
}