package creational.factory.robot

import creational.factory.Robot

class WiringBuilderRobot : Robot() {
    override fun connect(): String {
        println("Wiring connected")
        return "Wiring connected"
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