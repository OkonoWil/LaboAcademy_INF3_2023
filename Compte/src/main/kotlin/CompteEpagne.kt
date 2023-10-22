class CompteEpagne(num:Int, solde:Int, plancher:Int, private var tauxInteret: Double, private var nbJour:Int):Compte(num, solde,plancher) {

    fun calculInteret(): Double {
        val duree: Int = 90 * (nbJour / 90)
        return (this.consulterSolde() * duree * tauxInteret) / 365
    }

    fun afficher(): Unit {
        println("""
            Compte Epagne
                Solde: ${this.consulterSolde()}
                Intérêt: ${this.calculInteret()}
        """.trimIndent())
    }
}