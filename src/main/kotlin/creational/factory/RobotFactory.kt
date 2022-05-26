package creational.factory

import creational.factory.robot.DoorBuilderRobot
import creational.factory.robot.FrameBuilderRobot
import creational.factory.robot.TesterRobot
import creational.factory.robot.WiringBuilderRobot

class RobotFactory {

    fun getRobot(action: String): Robot? {
        if (action == null){
            return null;
        }
        if (action.equals("door", ignoreCase = true)){
            return DoorBuilderRobot();
        }
        if (action.equals("frame", ignoreCase = true)){
            return FrameBuilderRobot();
        }
        if (action.equals("wiring", ignoreCase = true)){
            return WiringBuilderRobot();
        }
        if (action.equals("tester", ignoreCase = true)){
            return TesterRobot();
        }

        return null
    }

}