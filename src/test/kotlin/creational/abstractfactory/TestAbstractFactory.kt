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
    fun testJollibeePromoCorrectInstance() {
        assertTrue(jollibeePromo is CompanyPromo)
    }

    @Test
    fun testJollibeePromoIncorrectInstance() {
        assertFalse(jollibeePromo is Promo)
    }

    @Test
    fun testJollibeePromoExpectedName() {
        assertEquals("Jollibee", jollibeePromo?.companyName())
    }

    @Test
    fun testJollibeePromoUnexpectedName() {
        assertNotEquals("McDonalds", jollibeePromo?.companyName())
    }

    @Test
    fun testMcDonaldsPromoCorrectInstance() {
        assertTrue(mcDonaldsPromo is CompanyPromo)
    }

    @Test
    fun testMcDonaldsPromoTypeIncorrectInstance() {
        assertFalse(mcDonaldsPromo is Promo)
    }

    @Test
    fun testMcDonaldsPromoExpectedName() {
        assertEquals("McDonalds", mcDonaldsPromo?.companyName())
    }

    @Test
    fun testMcDonaldsPromoUnexpectedName() {
        assertNotEquals("Jollibee", mcDonaldsPromo?.companyName())
    }

    @Test
    fun testNullCompanyName() {
        assertNull(nullCompanyPromo?.companyName())
    }

    @Test
    fun testPromoBundleTypeCorrectInstance() {
        assertTrue(promoBundle is Promo)
    }

    @Test
    fun testPromoBundleIncorrectInstance() {
        assertFalse(promoBundle is CompanyPromo)
    }

    @Test
    fun testPromoBundleCExpectedName(){
        assertEquals("Bundle", promoBundle?.promo())
    }

    @Test
    fun testPromoBundleUnexpectedName(){
        assertNotEquals("Discount", promoBundle?.promo())
    }

    @Test
    fun testPromoDiscountCorrectInstance() {
        assertTrue(promoDiscount is Promo)
    }

    @Test
    fun testPromoDiscountIncorrectInstance() {
        assertFalse(promoDiscount is CompanyPromo)
    }

    @Test
    fun testPromoDiscountExpectedName(){
        assertEquals("Discount", promoDiscount?.promo())
    }

    @Test
    fun testPromoDiscountUnexpectedName(){
        assertNotEquals("Raffle", promoDiscount?.promo())
    }

    @Test
    fun testPromoRaffleCorrectInstance() {
        assertTrue(promoRaffle is Promo)
    }

    @Test
    fun testPromoRaffleIncorrectInstance() {
        assertFalse(promoRaffle is CompanyPromo)
    }

    @Test
    fun testPromoRaffleExpectedName(){
        assertEquals("Raffle", promoRaffle?.promo())
    }

    @Test
    fun testPromoRaffleUnexpectedName(){
        assertNotEquals("Bundle", promoRaffle?.promo())
    }

    @Test
    fun testNullPromo() {
        assertNull(nullPromo?.promo())
    }
}