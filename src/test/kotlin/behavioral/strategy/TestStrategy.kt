package behavioral.strategy

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TestStrategy {

    val strategyTestAdd = OperationAdd()
    val strategyTestSubtract = OperationSubtract()
    val strategyTestMultiply = OperationMultiply()

    @Test
    fun testOperationAddExpectedResult() {
        val expected = 4
        assertEquals(expected, strategyTestAdd.doOperation(2, 2))
    }

    @Test
    fun testOperationAddUnexpectedResult() {
        val expected = 4
        assertNotEquals((expected + 1), strategyTestAdd.doOperation(2, 2))
    }

    @Test
    fun testOperationSubtractExpectedResult() {
        val expected = 4
        assertEquals(expected, strategyTestSubtract.doOperation(6, 2))
    }

    @Test
    fun testOperationSubtractUnexpectedResult() {
        val expected = 4
        assertNotEquals((expected + 1), strategyTestSubtract.doOperation(6, 2))
    }

    @Test
    fun testOperationMultiplyExpectedResult() {
        val expected = 4
        assertEquals(expected, strategyTestMultiply.doOperation(2, 2))
    }

    @Test
    fun testOperationMultiplyUnexpectedResult() {
        val expected = 4
        assertNotEquals((expected + 1), strategyTestMultiply.doOperation(2, 2))
    }
}