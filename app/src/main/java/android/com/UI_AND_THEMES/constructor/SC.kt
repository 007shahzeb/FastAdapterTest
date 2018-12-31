package android.com.UI_AND_THEMES.constructor

class SC(pass: String) {


    constructor(name: String, id: Int, pass: String) : this(pass) {
        println("Name is = $name")
        println("Id is = $id")
        println("Pass is = $pass")

    }


    constructor(name: String, pass: String) : this(pass) {

        println("n is = $name")
        println("p is = $pass")
    }
}

fun main(args: Array<String>) {

    val refe1 = SC("Smarit", 100, "myPass")
    val refe2 = SC("Smarit",  "myPass")


}