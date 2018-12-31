package android.com.kotlinFragment


fun main(args: Array<String>) {

    for (i in 1..30)
        print("$i ")

    println()

    for (i in 30 downTo 1)
        print("$i ")

    println()

    for (i in 1.rangeTo(30))
        print("$i ")

    println()

    for (i in 30.downTo(1))
        print("$i ")

    println()
}