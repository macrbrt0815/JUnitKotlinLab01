package structural.decorator

open class CarDecorator(private val car: Car) : Car{

    override fun addFeature(): String {
        return this.car.addFeature()
    }
}