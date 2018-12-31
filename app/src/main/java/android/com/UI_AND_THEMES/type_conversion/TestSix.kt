package android.com.UI_AND_THEMES.type_conversion

fun main(args: Array<String>) {

    // Case 1

//    for (sum in 1..5)
//    {
//        println("Value of i = $sum")
//    }

// Case 2
    var languages = arrayOf("Shahzeb", "Parvesh", "Aman", "Charanveer")

//    for (item in languages)
//        println(item)


    // Case 3
//    for (item in languages.indices)
//
//        if (item % 2 == 0)
//            println(languages[item])


    // Case 4


//    var text = "SmartIT"
//
//    for (letters in text)
//        println(letters)

    // Case 5

    var array = "StringArray"
    for (letters in array.indices)
        println(array[letters])

    callMe()  // User Defined functions without parameters

}


fun callMe() {

    println("Testing the user defined function")
}