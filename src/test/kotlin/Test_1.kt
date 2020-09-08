import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertTrue
import org.junit.jupiter.api.Test

class Test_1 {

    private val modelName = "Lada"

    @Test
    fun firstTest() {

        val car = mockk<Car>()
        every { car.model } returns modelName

        val user = User(
            firstName = "Петя",
            lastName = "Олушкин",
            carDriver = true,
            carOwner = true,
            car = car
        )

        assertTrue(car.model == modelName)
    }
}