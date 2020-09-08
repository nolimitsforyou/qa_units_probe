import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test

class Test_1 {

    @Test
    fun fst(){

        val car = Car().getDefaultCar()

        assertTrue(car.color != "")
    }
}