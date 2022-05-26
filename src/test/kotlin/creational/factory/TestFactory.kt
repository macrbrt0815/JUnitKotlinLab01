package creational.factory

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestFactory {
    private val robotFactory = RobotFactory()

    @Test
    fun whenGetRobotIsNull() {
        Assertions.assertNull(robotFactory.getRobot(""))
    }

    @Test
    fun whenGetRobotIsNotNull() {
        val result = robotFactory.getRobot("door")
        Assertions.assertNotNull(result)
    }

    @Test
    fun whenGetRobotIsNotInList() {
        val result = robotFactory.getRobot("rand")
        Assertions.assertNull(result)
    }
}