package creational.factory

fun main(){
    var robotFactory = RobotFactory();

    var robot: Robot? = robotFactory.getRobot("frame");
    robot?.connect()
}