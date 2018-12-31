package android.com.UI_AND_THEMES.inheritence

open class Person(age: Int, name: String) {

    init {

        println("The age is = $age")
        println("The name is = $name")

    }
}

class MathTeacher(age: Int, name: String) : Person(age, name) {
    fun mathTeacher() {
        println("I teach in primary school")
    }

}

class Footballer(age: Int, name: String) : Person(age, name) {

    fun playFootball() {
        println("I play for LA Gallaxy")
    }

}


class Bussinessman(age: Int, name: String) : Person(age, name) {
    fun runBussiness() {
        println("I am running a bussiness")
    }
}


fun main(args: Array<String>) {

    val mathTeacher = MathTeacher(100, "Balakram Singh")
    mathTeacher.mathTeacher()

    val footballer = Footballer(20, "Christiano")
    footballer.playFootball()


    val bussinessman = Bussinessman(50, "Charanveer singh gilli")
    bussinessman.runBussiness()

}

