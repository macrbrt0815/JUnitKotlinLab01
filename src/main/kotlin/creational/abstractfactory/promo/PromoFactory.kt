package creational.abstractfactory.promo

class PromoFactory {
    fun getPromo(promo: String?): Promo? {
        if (promo == null) return null
        if (promo.equals("bundle", ignoreCase = true)) {
            return PromoBundle()
        } else if (promo.equals("discount", ignoreCase = true)) {
            return PromoDiscount()
        } else if (promo.equals("raffle", ignoreCase = true)) {
            return PromoRaffle()
        }
        return null
    }
}
