package creational.factory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FactoryTest {
    private val robotFactory = RobotFactory()

    @Test
    fun whenGetRobotIsNull(){
        val result = robotFactory.getRobot("")
        Assertions.assertNull(result)
    }

    @Test
    fun whenGetRobotIsNotNull(){
        val result = robotFactory.getRobot("door")
        Assertions.assertNotNull(result)
    }

    @Test
    fun whenGetRobotIsNotInList(){
        val result = robotFactory.getRobot("rand")
        Assertions.assertNull(result)
    }
}