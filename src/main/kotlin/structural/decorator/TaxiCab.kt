package structural.decorator

class TaxiCab(car: Car) : CarDecorator(car) {

    override fun addFeature(): String {
        super.addFeature();
        println("Adding taxi cab features.")
        return "Taxi cab feature added!"
    }

}