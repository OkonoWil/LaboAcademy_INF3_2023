import java.awt.image.ByteLookupTable

class Rationnal(num:Int, denom:Int) {
    var num: Int = num
    var denom: Int = denom

    constructor(num:Int):this(num,1)

    fun normaliser(): Unit {
        val pgcdValue : Int = pgcd(this.num, this.denom)
        num /= pgcdValue
        denom = denom / pgcdValue
    }
    fun pgcd(a:Int, b:Int): Int {
        var result : Int = 0
        if(a==0 && b==0){
            result = 1
        }else if(a==0){
            result = b
        }else if(b==0){
            result = 0
        }else if(a<b){
            result = pgcd(a, b-a)
        }else{
            result = pgcd(a-b, b)
        }
        return result
    }
    fun add(r: Rationnal): Rationnal {
        val n:Int = this.num*r.denom +this.denom*r.num
        val d:Int = this.denom * r.denom
        val result:Rationnal = Rationnal(n,d)
        result.normaliser()
        return result
    }
    fun mult(r: Rationnal): Rationnal {
        val result = Rationnal(this.num*r.num, this.denom*r.denom)
        result.normaliser()
        return result
    }
    fun div(r: Rationnal): Rationnal {
        return this.mult(Rationnal(r.denom,r.num))
    }
    override fun toString():String{
        return "$num/$denom"
    }

}

fun main() {
    val r1:Rationnal = Rationnal(3,4)
    val r2:Rationnal = Rationnal(1,8)
    println("R1 = ${r1.toString()}")
    println("R2 = ${r2.toString()}")
    println("R1 + R2 = ${r1.add(r2)}")
    println("R1 * R2 = ${r1.mult(r2)}")

}

fun plusPetitRationnal(table: List<Rationnal>): Rationnal {
    return Rationnal(4)
}