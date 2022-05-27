package structural.decorator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestDecorator {
    private val raceCar = RaceCar(CarInstance())
    private val raceCab = TaxiCab(RaceCar(CarInstance()))
    private val cabRacer = RaceCar(TaxiCab(CarInstance()))
    private val basicCar = CarInstance()

    @Test
    fun testAddBasicFeature(){
        assertEquals("Basic feature added!", basicCar.addFeature())
    }

    @Test
    fun testAddBasicFeatureInvalid(){
        assertNotEquals("Basic feature added!", cabRacer.addFeature())
    }

    @Test
    fun testRaceCarAddFeature(){
        assertEquals("Race car feature added!", raceCar.addFeature())
    }

    @Test
    fun testRaceCarAddFeatureInvalid(){
        assertNotEquals("Race car feature added!", raceCab.addFeature())
    }

    @Test
    fun testRaceCabAddFeature(){
        assertEquals("Taxi cab feature added!", raceCab.addFeature())
    }

    @Test
    fun testRaceCabAddFeatureInvalid(){
        assertNotEquals("Taxi cab feature added!", cabRacer.addFeature())
    }

    @Test
    fun testCabRacerAddFeature(){
        assertEquals("Race car feature added!", cabRacer.addFeature())
    }

    @Test
    fun testCabRacerAddFeatureInvalid(){
        assertNotEquals("Race car feature added!", raceCab.addFeature())
    }
}