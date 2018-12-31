package android.com.UI_AND_THEMES.constructor

class DVInPC(fName: String = "", personAge: Int = 0) {

    val _fName = fName.capitalize()
    var _personAge = personAge


    init {

        println("_fName = ${_fName}")
        println("_personAge = ${_personAge}")
    }
}


fun main(args: Array<String>) {

    println("Person 1 is instantiated")
    val reference1 = DVInPC("Shahzeb", 100)

    println("Person 2 is instantiated")
    val reference2 = DVInPC("Shahzeb")


    println("Person 3 is instantiated")
    val reference3 = DVInPC()
}