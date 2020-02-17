package functions

fun main() {
    /*
    print("Enter the first number :")
    val numberOne = readLine()!!.toInt()

    print("Enter the second number :")
    val numberTwo = readLine()!!.toInt()


*/
    val numberOne = getValue("Enter the first number :")
    val numberTwo = getValue("Enter the second number :")
    /*-------------------Same code is happening Above---------------------------------*/

    print("Enter mathematical operator: ")


    /*  var result = when (readLine()!!) {
          "+" -> numberOne + numberTwo
          "-" -> numberOne - numberTwo
          "*" -> numberOne * numberTwo
          "/" -> numberOne / numberTwo
          else -> 0
          }
          print("Result = $result")
      }*/

    print("Result = ${calculate(numberOne, numberTwo)}")

    //you can use func. with default arguments like below. If you won't call the func. with all parameters you can write default values to paramaters in func.
    reformatString("message", true, 7, "tr")
    reformatString("message", size = 7, lang = "tr")
    reformatString("message", true, 7, "tr")
    reformatString("message", size = 7)

    getUserInfo("caner", "grs", "bursa", "tr")
    getUserInfo(*arrayOf("caner", "grs", "bursa", "tr"))
}

//numberone and numbertwo are paramaters. ":String" is return type of the function.
fun calculate(numberOne: Int, numberTwo: Int): Double {
    var result = when (readLine()!!) {
        "+" -> numberOne + numberTwo
        "-" -> numberOne - numberTwo
        "*" -> numberOne * numberTwo
        "/" -> numberOne / numberTwo
        else -> 0
    }
    return result.toDouble()
}

fun getValue(printMessage: String = ""): Int {
    print(printMessage)
    val value = readLine()!!.toInt()
    println("---------------------------")
    return value
}


fun reformatString(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {

}

//vararg can be used if parameter number unknown.you cannot use vararg twice
fun getUserInfo(vararg userInfo: String) {

}

