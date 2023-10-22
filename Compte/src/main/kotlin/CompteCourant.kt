class CompteCourant(num:Int, solde:Int, plancher:Int, private var tauxAgios: Double, private var nbJour:Int):Compte(num, solde,plancher) {

    fun calculAgios(): Double {
        val duree: Int = 14 * (nbJour / 14)
        return (this.consulterSolde() * duree * tauxAgios) / 365
    }

    fun afficher(): Unit {
        println("""
            Compte Courant
                Solde: ${this.consulterSolde()}
                Agios: ${this.calculAgios()}
        """.trimIndent())
    }
}