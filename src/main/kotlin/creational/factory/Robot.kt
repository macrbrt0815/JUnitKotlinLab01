package creational.factory

abstract class Robot{
    var name:String = ""

    abstract fun connect(): String
    abstract fun disconnect()
    abstract fun prepareForTask()
    abstract fun doTask()
    abstract fun isFinished()

}