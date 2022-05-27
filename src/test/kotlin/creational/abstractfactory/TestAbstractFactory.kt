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
    val nullPromo = PromoFactory().getPromo("")


    @Test
    fun testJollibeePromoType001() {
        assertTrue(jollibeePromo is CompanyPromo)
    }

    @Test
    fun testJollibeePromoType002() {
        assertFalse(jollibeePromo is Promo)
    }

    @Test
    fun testJollibeePromo001() {
        assertEquals("Jollibee", jollibeePromo?.companyName())
    }

    @Test
    fun testJollibeePromo002() {
        assertNotEquals("McDonalds", jollibeePromo?.companyName())
    }

    @Test
    fun testMcDonaldsPromType001() {
        assertTrue(mcDonaldsPromo is CompanyPromo)
    }

    @Test
    fun testMcDonaldsPromoType002() {
        assertFalse(mcDonaldsPromo is Promo)
    }

    @Test
    fun testMcDonaldsPromo001() {
        assertEquals("McDonalds", mcDonaldsPromo?.companyName())
    }

    @Test
    fun testMcDonaldsPromo002() {
        assertNotEquals("Jollibee", mcDonaldsPromo?.companyName())
    }

    @Test
    fun testNullCompany001() {
        assertNull(nullCompanyPromo?.companyName())
    }

    @Test
    fun testPromoBundleType001() {
        assertTrue(promoBundle is Promo)
    }

    @Test
    fun testPromoBundleType002() {
        assertFalse(promoBundle is CompanyPromo)
    }

    @Test
    fun testPromoBundle001(){
        assertEquals("Bundle", promoBundle?.promo())
    }

    @Test
    fun testPromoBundle002(){
        assertNotEquals("Discount", promoBundle?.promo())
    }

    @Test
    fun testPromoDiscountType001() {
        assertTrue(promoDiscount is Promo)
    }

    @Test
    fun testPromoDiscountType002() {
        assertFalse(promoDiscount is CompanyPromo)
    }

    @Test
    fun testPromoDiscount001(){
        assertEquals("Discount", promoDiscount?.promo())
    }

    @Test
    fun testPromoDiscount002(){
        assertNotEquals("Raffle", promoDiscount?.promo())
    }

    @Test
    fun testPromoRaffleType001() {
        assertTrue(promoRaffle is Promo)
    }

    @Test
    fun testPromoRaffleType002() {
        assertFalse(promoRaffle is CompanyPromo)
    }

    @Test
    fun testPromoRaffle001(){
        assertEquals("Raffle", promoRaffle?.promo())
    }

    @Test
    fun testPromoRaffle002(){
        assertNotEquals("Bundle", promoRaffle?.promo())
    }

    @Test
    fun testNullPromo001() {
        assertNull(nullPromo?.promo())
    }

}