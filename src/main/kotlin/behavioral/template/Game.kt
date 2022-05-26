package behavioral.template

abstract class Game{
    abstract fun initialize(): String
    abstract fun startPlay()
    abstract fun endPlay()

    fun play() {
        initialize()
        startPlay()
        endPlay()
    }
}