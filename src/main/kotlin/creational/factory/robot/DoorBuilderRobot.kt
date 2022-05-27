package creational.factory.robot

import creational.factory.Robot

class DoorBuilderRobot : Robot() {
    override fun connect(): String {
        println("Door connected")
        return "Door connected"
    }

    override fun disconnect() {
        TODO("Not yet implemented")
    }

    override fun prepareForTask() {
        TODO("Not yet implemented")
    }

    override fun doTask() {
        TODO("Not yet implemented")
    }

    override fun isFinished() {
        TODO("Not yet implemented")
    }

}