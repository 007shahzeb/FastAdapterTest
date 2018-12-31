package android.com.UI_AND_THEMES.function


fun addTwoNumber(number1: Double, number2: Double): Int {
    val sum = number1 + number2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun main(args: Array<String>) {
    val number1 = 12.5
    val number2 = 3.5
    var Results: Int

    Results = addTwoNumber(number1, number2)
    println("Result is = $Results")

}


