package creational.factory

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestFactory {
    private val robotFactory = RobotFactory()

    private val doorBuilder = robotFactory.getRobot("door")
    private val frameBuilder = robotFactory.getRobot("frame")
    private val tester = robotFactory.getRobot("tester")
    private val wiringBuilder = robotFactory.getRobot("wiring")

    private val emptyBuilder = robotFactory.getRobot("")
    private val randomBuilder = robotFactory.getRobot("rand")

    @Test
    fun testDoorBuilderNotNull(){
        assertNotNull(doorBuilder)
    }

    @Test
    fun testDoorBuilderConnected(){
        assertEquals("Door connected", doorBuilder?.connect())
    }

    @Test
    fun testDoorBuilderNotConnected(){
        assertNotEquals("Frame connected", doorBuilder?.connect())
    }

    @Test
    fun testFrameBuilderNotNull(){
        assertNotNull(frameBuilder)
    }

    @Test
    fun testFrameBuilderConnected(){
        assertEquals("Frame connected", frameBuilder?.connect())
    }

    @Test
    fun testFrameBuilderNotConnected(){
        assertNotEquals("Tester connected", frameBuilder?.connect())
    }

    @Test
    fun testTesterNotNull(){
        assertNotNull(tester)
    }

    @Test
    fun testTesterConnected(){
        assertEquals("Tester connected", tester?.connect())
    }

    @Test
    fun testTesterNotConnected(){
        assertNotEquals("Wiring connected", tester?.connect())
    }

    @Test
    fun testWiringBuilderNotNull(){
        assertNotNull(wiringBuilder)
    }

    @Test
    fun testWiringBuilderConnected(){
        assertEquals("Wiring connected", wiringBuilder?.connect())
    }

    @Test
    fun testWiringBuilderNotConnected(){
        assertNotEquals("Door connected", wiringBuilder?.connect())
    }

    @Test
    fun testGetRobotIsNull(){
        assertNull(emptyBuilder)
    }

    @Test
    fun testGetRobotNotInList(){
        assertNull(randomBuilder)
    }

}