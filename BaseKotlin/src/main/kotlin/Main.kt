fun main(args: Array<String>) {
    val p:Etudiant<Char> = Etudiant("Issa", 'C')
    p.marcher()
}
/*
* LES TYPES
* */
// LES ENTIERS
var num1: Int = 1
var num2: Short = 1
var num3: Long = 1
// LES DECIMAUX
var num4: Double = 1.0
var num5: Float = 1.0F
var num6: Number = 5

/*
* LES CHAINES DE CARACTERES
* */
var str : String = "Toto"

/*
* LES CARACTERES
* */
var chr : Char = 'C'

/*
* BOOLEAN
* */
var bool: Boolean = true

/*
* LE TYPE ANY
**/
var test: Any = "DD"
var test1: Any = 45
var test2: Any = 5.0

/*
* EXPRESSION CONDICTIONNELLE
* */
if(chr=='4'){
    println("")
}else if(){
    println("")
}

when(num6){
    1 -> println("UN")
    2 -> println("DEUX")
    3 -> println("TROIS")
    else -> println("AUTRES")
}

/*
* BOUCLES
* */
do{

}while

for(){

}

while(){

}

/*
* LES FONCTIONS
* */

// SANS PARAMETRE
fun maFunction(): Unit {

}
// AVEC PARAMETRE
fun maFunction2(t: Any, y: Any): Unit {

}
// AVEC TYPE DE RETOURE
fun fullName(): String {
    return "Toto"
}

// LES CLASSES

open class Person(name:String){
    val name:String
    // INITIALISATION
    init{
        this.name = name + " F"
    }
    // DEUXIEME CONSTRUCTEUR SANS PARAMETTRE
    constructor():this("Toto")

    open internal fun affiche(){
        println("A person $name")
    }
}
abstract class Enfant{
     abstract fun marcher()
}

interface Action{
    abstract fun marcher()
}

//HERITAGE ET IMPLEMENTATION
class Etudiant<T>(name:String, age:T):Person(name), Action{
    var age = age
    override fun affiche(){
        println("$name $age")
    }
    override fun marcher() {
        println("Person marcher")
    }
}
