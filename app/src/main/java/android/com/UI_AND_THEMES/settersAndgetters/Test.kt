package android.com.UI_AND_THEMES.settersAndgetters

class Test {

    var name: String = "Default"

        get() = field

        set(value) {

            field = value
        }

}


fun main(args: Array<String>) {

    val test = Test()
    test.name

    println("= ${test.name}")

}