package creational.abstractfactory

class PromoCreatorFactory {
    fun getPromo(choice: String): CompanyPromo? {
        if (choice.equals("jollibee", ignoreCase = true)) {
            return JollibeePromo()
        } else if (choice.equals("mcdonalds", ignoreCase = true)) {
            return McDonaldsPromo()
        }
        return null
    }
}
