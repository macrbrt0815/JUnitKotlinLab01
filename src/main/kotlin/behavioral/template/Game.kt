package behavioral.template

abstract class Game{
    abstract fun initialize(): String
    abstract fun startPlay(): String
    abstract fun endPlay(): String

    fun play() {
        initialize()
        startPlay()
        endPlay()
    }
}