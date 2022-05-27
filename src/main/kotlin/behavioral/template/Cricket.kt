package behavioral.template

class Cricket : Game() {
    override fun initialize(): String {
        println("Cricket game initialized! Start playing")
        return "Cricket game initialized! Start playing"
    }

    override fun startPlay(): String {
        println("Cricket game started!")
        return "Cricket game started!"
    }

    override fun endPlay(): String {
        println("Cricket game finished!")
        return "Cricket game finished!"
    }

}