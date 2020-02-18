package functions

fun main() {
    val pi: Double = 3 + 0.14
    println(pi)
    val schoolNumber: Int = 36535
    println(schoolNumber)
    val tcIdentity: Long = 32612543298
    println(tcIdentity)

    1235.log("")
    5545454.log("")
    pi.log("")

    log2(schoolNumber)
//         infix functions can be used with extension functions.
//         Since extPlus has an infix extension. (dot) does not need to be used.
//         If log is only extension function. Called with (dot).
    //      Extension functions can be seen in yellow color expressions.
    "3" extPlus "" log ""
}

fun log2(number: Number) {
    println(number)
}

infix fun Number.log(emptyParam: String) {
    println(emptyParam + this)
}

infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()

class Shape {
    //    fun calculateArea(edge:Int): Int{
//        return edge * edge
//    }
    fun calculateArea(edge: Int): Int = edge * edge

}

/*fun Shape.calculateArea(edge:Int): Int {
    val result = edge *edge
    println(result)
    return result

    **if you have identical same method one inside member class other in as function
    **it will compile inside member class. But for example if you change "edge:Int" to
    ** "edge: Double" inside function above and call it with double value, it will compile the
    ** extension function above.
}*/


