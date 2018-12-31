package android.com.UI_AND_THEMES.constructor

open class Parent {


    constructor(name: String, id: Int) {

        println("E1")
        println("_firstConstructor = $name")
        println("_firstConstructor = $id")
    }

    constructor(name: String, id: Int, password: String) {
        println("E3")
        println("_secondConstructor = $name")
        println("_secondConstructor = $id")
        println("_secondConstructor = $password")
    }


}

class Child : Parent {


    constructor(name: String, id: Int) : super(name, id) {

        println("E2")
        println("= $name")
        println("= $id")
    }


    constructor(name: String, id: Int, password: String) : super(name, id, password) {
        println("E4")
        println("== $name")
        println("== $id")
        println("== $password")
    }

}


fun main(args: Array<String>) {
    val obj1 = Child("Ashu", 101)
    val obj2 = Child("Ashu", 101,"mypassword")

}