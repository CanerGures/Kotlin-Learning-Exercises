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

fun getValue(printMessage: String): Int {
    print(printMessage)
    return readLine()!!.toInt()
}