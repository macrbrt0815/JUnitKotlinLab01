package behavioral.template

class Cricket : Game() {
    override fun initialize(): String {
        println("Cricket game initialized! Start playing")
        return "Cricket game initialized! Start playing"
    }

    override fun startPlay() {
        println("Cricket game started! Enjoy the game!")
    }

    override fun endPlay() {
        println("Cricket game finished!")
    }

}