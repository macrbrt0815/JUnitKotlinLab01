package behavioral.strategy

fun main(args: Array<String>) {
    var context = Context(OperationAdd())
    System.out.println("10 + 5 = " + context.executeStrategy(10, 5))
    context = Context(OperationSubtract())
    System.out.println("10 - 5 = " + context.executeStrategy(10, 5))
    context = Context(OperationMultiply())
    System.out.println("10 * 5 = " + context.executeStrategy(10, 5))
}
