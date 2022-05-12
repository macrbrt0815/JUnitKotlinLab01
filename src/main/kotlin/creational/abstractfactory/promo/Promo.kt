package creational.abstractfactory.promo

abstract class Promo {
    private var name = ""

    abstract fun start()
    abstract fun end()
    abstract fun addRegistrant()

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }
}