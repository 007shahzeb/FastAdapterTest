package android.com.UI_AND_THEMES.function

fun main(args: Array<String>) {

    getName("Shahzeb", "Khan")
    println(getName("Shahzeb", "Khan"))

}

fun getName(firstName: String, lastName: String): String = "FirstName is = $firstName and the LastName is = $lastName"

