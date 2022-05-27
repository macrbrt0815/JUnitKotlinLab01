package behavioral.template

class Football : Game(){
    override fun initialize(): String {
        println("Football game initialized! Start playing")
        return "Football game initialized! Start playing"
    }

    override fun startPlay(): String {
        println("Football game started!")
        return "Football game started!"
    }

    override fun endPlay(): String {
        println("Football game finished!")
        return "Football game finished!"
    }
}