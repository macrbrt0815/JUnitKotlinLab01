package structural.decorator

class CarInstance : Car{
    override fun addFeature(): String {
        println("Basic Feature")
        return "Basic feature added!"
    }
}