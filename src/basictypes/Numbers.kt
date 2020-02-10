package basictypes

fun main() {
    //difference between val and var: "val" cannot be changed when it assigned but "var" can.
    val name : String = "Caner G."
    var car : String = "Ferrari"
    car = "Porsche"
    //kotlin can recognize primitive types if not given any.
    val shoe = "Adidas"
    val size = 43
    //if you want to change value of the variable later, you must define type
    val watch : String
    watch ="Nike"

    val minByteValue : Byte = Byte.MIN_VALUE //size = 8
    val maxByteValue : Byte = Byte.MAX_VALUE

    val minShortValue : Short = Short.MIN_VALUE//size = 16
    val maxShortValue : Short = Short.MAX_VALUE

    val minIntValue : Int = Int.MIN_VALUE//size = 32
    val maxIntValue : Int = Int.MAX_VALUE

    val minLongValue : Long = Long.MIN_VALUE//size = 64
    val maxLongValue : Long = Long.MAX_VALUE

    val minFloatValue : Float = Float.MIN_VALUE//size = 32
    val maxFloatValue : Float = Float.MAX_VALUE

    val minDoubleValue : Double = Double.MIN_VALUE//size = 64
    val maxDoubleValue : Double = Double.MAX_VALUE

    println("minByteValue" + minByteValue)
    println("maxByteValue" + maxByteValue)
    println("minShortValue" + minShortValue)
    println("maxShortValue" + maxShortValue)
    println("minIntValue" + minIntValue)
    println("maxIntValue" + maxIntValue)
    println("minLongValue" + minLongValue)
    println("maxLongValue" + maxLongValue)
    println("minFloatValue" + minFloatValue)
    println("maxFloatValue" + maxFloatValue)
    println("minDoubleValue" + minDoubleValue)
    println("maxDoubleValue" + maxDoubleValue)

    //Unsigned types allows to write most performance friendly types maxByte=127 minByte= -128 UByte = 255

    val number : UByte = 254u
    println ("number" + number)

}