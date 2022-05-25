package creational.factory

abstract class Robot{
    var name:String = ""

    abstract fun connect()
    abstract fun disconnect()
    abstract fun prepareForTask()
    abstract fun doTask()
    abstract fun isFinished()

}