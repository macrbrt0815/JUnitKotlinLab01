package creational.abstractfactory.promo

class PromoDiscount : Promo() {
    override fun promo(): String {
        return "Discount"
    }
}