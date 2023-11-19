class Fibre <T>(var list: MutableList<T>) where T : Complement{

    constructor(): this(arrayListOf<T>())

    fun fibreVide(): Boolean {
        return list.isEmpty()
    }

    fun dupliquer(): Fibre <T>{
        val f:Fibre<T> = Fibre()
        for(a in list){
            f.list.add(a.complement())
        }
        return f
    }

    fun comparer(f: Fibre <T>): Boolean {
        if (this.list.size == f.list.size){
            for (i in 0 until  list.size){
                if (this.list[i] != f.list[i].complement()){
                    return false
                }
            }
            return true

        }
        return false

    }

    fun comparerSimple(f: Fibre <T>): Boolean {
       return this.list.equals(f.dupliquer().list)

    }

    fun harmingSimple(f: Fibre <T>): Int {
        var result:Int =  0
        if (this.list.size == f.list.size){
            for (i in 0 until  list.size){
                if (this.list[i] != f.list[i]){
                  result++
                }
            }
            return result
        }
        return  -1
    }

    fun harming(f: Fibre <T>): Int {
        var result:Int = 0
        try {
            if (this.list.size != f.list.size){
                throw Exception()
                println(1)
            }
            else {
                for (i in 0 until list.size) {
                    if (this.list[i] != f.list[i]) {
                        result++
                    }

                }
            }
        }catch (e:Exception){
            println("taille")
        }
        return result
    }
}

private fun <E> MutableList<E>.add(element: Complement) {
this.add(element)
}
