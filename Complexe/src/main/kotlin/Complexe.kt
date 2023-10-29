class Complexe(var r:Double,var i:Double) {
    constructor(r:Double):this(r,0.0)

    override fun toString(): String {
        if (i == 0.0 && r == 0.0){
            return "0"
        }
        else if(i == 0.0){
            return  "$r"
        }
        else if(r == 0.0){
            return "${i}i"
        }
        else if(i < 0.0){
            return "$r ${i}i"
        }
        return "$r + ${i}i"
    }
    fun add(c : Complexe): Complexe{
        return Complexe(c.r+r, c.i+i)
    }
    fun mult(c:Complexe): Complexe{
        val r_tmp:Double = (r*c.r) - (c.i*i)
        val i_tmp:Double = (r*c.i) + (i*c.r)
        return Complexe(r_tmp,i_tmp)
    }
    companion object{
        fun incPartI(tab:MutableList<Complexe>):Unit{
            for (c in tab){
                c.i++
            }
        }
    }
}