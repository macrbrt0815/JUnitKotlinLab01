package creational.factory.robot

import creational.factory.Robot

class TesterRobot : Robot() {
    override fun connect(): String {
        println("Tester connected")
        return "Tester connected"
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