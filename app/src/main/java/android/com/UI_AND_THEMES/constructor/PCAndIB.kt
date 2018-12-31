package android.com.UI_AND_THEMES.constructor

class PCAndIB(fName: String, personAge: Int) {

    // you can do it like this
    val _fName: String = fName
    var _personAge: Int = personAge



    init {
//        you can do it like this too
//        _fName = fName.capitalize()
//        _personAge = personAge

        println("fName is = ${_fName}")
        println("personAge is = ${_personAge}")

    }

}


fun main(args: Array<String>) {

    val reference = PCAndIB("SmartIT", 20)


}