package creational.abstractfactory

import creational.abstractfactory.promo.Promo
import creational.abstractfactory.promo.PromoFactory
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TestAbstractFactory {

    val jollibeePromo = PromoCreatorFactory().getPromo("jollibee")
    val mcDonaldsPromo = PromoCreatorFactory().getPromo("mcdonalds")
    val nullCompanyPromo = PromoCreatorFactory().getPromo("")

    val promoDiscount = PromoFactory().getPromo("discount")
    val promoBundle = PromoFactory().getPromo("bundle")
    val promoRaffle = PromoFactory().getPromo("raffle")

    @Test
    fun testJollibeePromo001() {
        assertTrue(jollibeePromo is CompanyPromo)
    }

    @Test
    fun testJollibeePromo002() {
        assertFalse(jollibeePromo is Promo)
    }

    @Test
    fun testJollibeePromo003() {
        assertEquals("Jollibee", jollibeePromo?.companyName())
    }

    @Test
    fun testJollibeePromo004() {
        assertNotEquals("McDonalds", jollibeePromo?.companyName())
    }

    @Test
    fun testMcDonaldsPromo001() {
        assertTrue(mcDonaldsPromo is CompanyPromo)
    }

    @Test
    fun testMcDonaldsPromo002() {
        assertFalse(mcDonaldsPromo is Promo)
    }

    @Test
    fun testMcDonaldsPromo003() {
        assertEquals("McDonalds", mcDonaldsPromo?.companyName())
    }

    @Test
    fun testMcDonaldsPromo004() {
        assertNotEquals("Jollibee", mcDonaldsPromo?.companyName())
    }

    @Test
    fun testNullCompany001() {
        assertNull(nullCompanyPromo?.companyName())
    }

    @Test
    fun testPromoBundle001() {
        assertTrue(promoBundle is Promo)
    }

    @Test
    fun testPromoBundle002() {
        assertFalse(promoBundle is CompanyPromo)
    }

    @Test
    fun testPromoBundle003(){
        assertEquals("Bundle", promoBundle?.promo())
    }

    @Test
    fun testPromoBundle004(){
        assertNotEquals("Discount", promoBundle?.promo())
    }

    @Test
    fun testPromoDiscount001() {
        assertTrue(promoDiscount is Promo)
    }

    @Test
    fun testPromoDiscount002() {
        assertFalse(promoDiscount is CompanyPromo)
    }

    @Test
    fun testPromoDiscount003(){
        assertEquals("Discount", promoDiscount?.promo())
    }

    @Test
    fun testPromoDiscount004(){
        assertNotEquals("Raffle", promoDiscount?.promo())
    }

    @Test
    fun testPromoRaffle001() {
        assertTrue(promoRaffle is Promo)
    }

    @Test
    fun testPromoRaffle002() {
        assertFalse(promoRaffle is CompanyPromo)
    }

    @Test
    fun testPromoRaffle003(){
        assertEquals("Raffle", promoRaffle?.promo())
    }

    @Test
    fun testPromoRaffle004(){
        assertNotEquals("Bundle", promoRaffle?.promo())
    }

}