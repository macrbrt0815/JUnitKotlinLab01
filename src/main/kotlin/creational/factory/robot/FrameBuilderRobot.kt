package creational.factory.robot

import creational.factory.Robot

class FrameBuilderRobot : Robot() {
    override fun connect(): String {
        println("Frame connected")
        return "Frame connected"
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