package behavioral.strategy

import behavioral.strategy.OperationAdd
import behavioral.strategy.OperationMultiply
import behavioral.strategy.OperationSubtract
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TestStrategy {

    val strategyTestAdd: OperationAdd = OperationAdd()
    val strategyTestSubtract: OperationSubtract = OperationSubtract()
    val strategyTestMultiply: OperationMultiply = OperationMultiply()

    @Test
    fun testOperationAddCorrect() {
        val expected = 4
        assertEquals(expected, strategyTestAdd.doOperation(2,2))
    }

    @Test
    fun testOperationAddIncorrect() {
        val expected = 4
        assertNotEquals((expected+1), strategyTestAdd.doOperation(2,2))
    }

    @Test
    fun testOperationSubtractCorrect() {
        val expected = 4
        assertEquals(expected, strategyTestSubtract.doOperation(6,2))
    }

    @Test
    fun testOperationSubtractIncorrect() {
        val expected = 4
        assertNotEquals((expected+1), strategyTestSubtract.doOperation(6,2))
    }

    @Test
    fun testOperationMultiplyCorrect() {
        val expected = 4
        assertEquals(expected, strategyTestMultiply.doOperation(2,2))
    }

    @Test
    fun testOperationMultiplyIncorrect() {
        val expected = 4
        assertNotEquals((expected+1), strategyTestMultiply.doOperation(2,2))
    }
}