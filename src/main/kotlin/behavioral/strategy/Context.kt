package behavioral.strategy

class Context {
    private val strategy: Strategy

    constructor(strategy: Strategy) {
        this.strategy = strategy
    }

    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }
}
