package behavioral.strategy

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TestStrategy {

    lateinit var context : Context

    @Test
    fun testOperationAddExpectedResult() {
        context = Context(OperationAdd())
        val expected = 4
        assertEquals(expected, context.executeStrategy(2, 2))
    }

    @Test
    fun testOperationAddUnexpectedResult() {
        context = Context(OperationAdd())
        val expected = 4
        assertNotEquals((expected + 1), context.executeStrategy(2, 2))
    }

    @Test
    fun testOperationSubtractExpectedResult() {
        context = Context(OperationSubtract())
        val expected = 4
        assertEquals(expected, context.executeStrategy(6, 2))
    }

    @Test
    fun testOperationSubtractUnexpectedResult() {
        context = Context(OperationSubtract())
        val expected = 4
        assertNotEquals((expected + 1), context.executeStrategy(6, 2))
    }

    @Test
    fun testOperationMultiplyExpectedResult() {
        context = Context(OperationMultiply())
        val expected = 4
        assertEquals(expected, context.executeStrategy(2, 2))
    }

    @Test
    fun testOperationMultiplyUnexpectedResult() {
        context = Context(OperationMultiply())
        val expected = 4
        assertNotEquals((expected + 1), context.executeStrategy(2, 2))
    }
}