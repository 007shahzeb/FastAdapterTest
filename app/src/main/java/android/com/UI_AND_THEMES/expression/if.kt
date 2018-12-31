package android.com.UI_AND_THEMES.expression

fun main(args: Array<String>) {


    val test: Int = 10


    // Case 1
//    val result = if (test >= 10) "Possitive Number" else "Negative Number"
//    println(result)


    // Case 2
//    var checking = if (test > 0) println("Possitive") else if (test < 0) "Negative" else "Nothing"
//    println(checking)


    var n1 = 2
    var n2 = 5
    var n3 = -3


    val max = if (n1 > n2) {

        if (n1 > n3)

            n1
        else
            n3

    } else {


        if (n2 > n3)

            n2
        else
            n3


    }

    println(max)




}