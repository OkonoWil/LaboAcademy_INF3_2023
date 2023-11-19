fun main(args: Array<String>) {
    val f: Fibre<Nucleotide> = Fibre(arrayListOf<Nucleotide>(Nucleotide.Adenine,Nucleotide.Thymine,Nucleotide.Thymine,Nucleotide.Cytosine))
    val f1: Fibre<Nucleotide> = Fibre(arrayListOf<Nucleotide>(Nucleotide.Thymine,Nucleotide.Adenine,Nucleotide.Adenine,Nucleotide.Guanine))
    val f2: Fibre<Nucleotide> = Fibre(arrayListOf<Nucleotide>(Nucleotide.Thymine,Nucleotide.Adenine,Nucleotide.Adenine))

    println(f.dupliquer())
    println(f1.harming(f2))
    //println(f.list)
    //  println(f.dupliquer().list)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}