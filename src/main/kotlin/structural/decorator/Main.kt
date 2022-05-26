package structural.decorator

fun main(){
    println("--Race Car--")
    val raceCar = RaceCar(CarInstance())
    raceCar.addFeature()

    println("--Taxi Cab--")
    val raceCab = TaxiCab(RaceCar(CarInstance()))
    raceCab.addFeature()

    println("--Cabs Racer--")
    val cabRacer = RaceCar(TaxiCab(CarInstance()))
    cabRacer.addFeature()
}