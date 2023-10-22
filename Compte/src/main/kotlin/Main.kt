fun main(args: Array<String>) {
    val compteCourant: CompteCourant = CompteCourant(1,10000,1000,0.05,30)
    val compteEpagne: CompteEpagne = CompteEpagne(1,500000,1000,0.05,200)
    println("Solde : ${compteCourant.consulterSolde()}")
    println("Solde : ${compteEpagne.consulterSolde()}")
    compteCourant.crediterCompte(15000)
    compteEpagne.crediterCompte(200000)
    println("Solde : ${compteCourant.consulterSolde()}")
    println("Solde : ${compteEpagne.consulterSolde()}")
    println("Débiter : ${compteCourant.debiterCompte(25000)} Solde: ${compteCourant.consulterSolde()}")
    println("Débiter : ${compteEpagne.debiterCompte(100000)} Solde: ${compteEpagne.consulterSolde()}")
    println("Agios: ${compteCourant.calculAgios()}")
    println("Intérêt : ${compteEpagne.calculInteret()}")
}