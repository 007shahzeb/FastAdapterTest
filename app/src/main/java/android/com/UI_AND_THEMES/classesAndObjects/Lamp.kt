package android.com.UI_AND_THEMES.classesAndObjects

class Lamp {


    var isOn: Boolean = true
   protected var isOff: Boolean = false
    private var accessFail: Int = 100

    fun turnON() {
        isOn = true
        println("isON = $isOn")

    }

    fun turnOFF() {
        isOff = false
        println("isOff = $isOff")
    }


    fun displayLights(Lamp: String) {

        if (isOn == true) println("Lamp is ON ") else println("Lamp is OFF")

    }


    fun displayLights() {

        if (isOn == false) println("Lamp is ON ") else println("Lamp is OFF")

    }


}


fun main(a: Array<String>) {

    val l1 = Lamp()
    l1.displayLights("l1")


    val l2 = Lamp()
    l2.displayLights()


    l1.isOn

//    var cc=B()
//    cc.charan()


}