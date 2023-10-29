fun main(args: Array<String>) {
    val t: MutableList<Complexe> = arrayListOf(Complexe(1.0,2.0),Complexe(1.0,-2.0))
    for (c in t){
        println(c)
    }
    Complexe.incPartI(t)
    for (c in t){
        println(c)
    }
}