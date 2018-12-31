package android.com.UI_AND_THEMES.classesAndObjects

open class Test {

    protected var a = 100
}

class B : Test() {

    fun charan() {
        println(B().a)
    }

}

fun main(a: Array<String>) {

    val bb = B()
    bb.charan()
}


