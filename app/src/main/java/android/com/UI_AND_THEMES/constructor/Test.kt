package android.com.UI_AND_THEMES.constructor

class Test{

    constructor(name: String, id: Int): this(name,id, "mypassword"){
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String){
        println("Second Const")
        println("_Name = ${name}")
        println("_Id = ${id}")
        println("_Password = ${pass}")
    }
}
fun main(args: Array<String>){

    val myclass = Test ("Ashu", 101)

}