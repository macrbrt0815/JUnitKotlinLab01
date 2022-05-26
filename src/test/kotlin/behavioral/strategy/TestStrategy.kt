package behavioral.strategy

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TestStrategy {

    val strategyTestAdd = OperationAdd()
    val strategyTestSubtract = OperationSubtract()
    val strategyTestMultiply = OperationMultiply()

    @Test
    fun testOperationAdd001() {
        val expected = 4
        assertEquals(expected, strategyTestAdd.doOperation(2,2))
    }

    @Test
    fun testOperationAdd002() {
        val expected = 4
        assertNotEquals((expected+1), strategyTestAdd.doOperation(2,2))
    }

    @Test
    fun testOperationSubtract001() {
        val expected = 4
        assertEquals(expected, strategyTestSubtract.doOperation(6,2))
    }

    @Test
    fun testOperationSubtract002() {
        val expected = 4
        assertNotEquals((expected+1), strategyTestSubtract.doOperation(6,2))
    }

    @Test
    fun testOperationMultiply001() {
        val expected = 4
        assertEquals(expected, strategyTestMultiply.doOperation(2,2))
    }

    @Test
    fun testOperationMultiply002() {
        val expected = 4
        assertNotEquals((expected+1), strategyTestMultiply.doOperation(2,2))
    }
}