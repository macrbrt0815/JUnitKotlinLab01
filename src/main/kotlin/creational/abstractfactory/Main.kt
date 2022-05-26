package creational.abstractfactory

import creational.abstractfactory.promo.Promo
import creational.abstractfactory.promo.PromoFactory

fun main(args: Array<String>) {
    val companyPromo: CompanyPromo? = PromoCreatorFactory().getPromo("jollibee")
    val promo: Promo? = PromoFactory().getPromo("discount")

    companyPromo?.companyName()
    promo?.promo()
}
