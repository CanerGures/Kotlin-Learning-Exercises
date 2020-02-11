package basictypes

fun main() {

    val pi: UInt = 3.14.toUInt()

    val schoolNumber: Short = 1341
    val convertedValue = 1341.toByte()

    //when schoolNumber printed it will not printed equally to schoolNumber because Byte value interval exceeded(-128,127).
    println("schoolNumber :" + schoolNumber)
}