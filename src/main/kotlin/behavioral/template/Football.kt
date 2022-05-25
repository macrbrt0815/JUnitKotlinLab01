package behavioral.template

class Football : Game(){
    override fun initialize(): String {
        println("Football game initialized! Start playing")
        return "Football game initialized! Start playing"
    }

    override fun startPlay() {
        println("Football game started! Enjoy the game!")
    }

    override fun endPlay() {
        println("Football game finished!")
    }
}