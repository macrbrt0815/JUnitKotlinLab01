package structural.decorator

open class CarDecorator(protected val car: Car) : Car{

    override fun addFeature() {
        this.car.addFeature()
    }
}