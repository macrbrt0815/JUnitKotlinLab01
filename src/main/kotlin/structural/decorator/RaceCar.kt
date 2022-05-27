package structural.decorator

class RaceCar(car: Car) : CarDecorator(car) {
    override fun addFeature(): String {
        super.addFeature()
        println("Adding race car features.")
        return "Race car feature added!"
    }
}