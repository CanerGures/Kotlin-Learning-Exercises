package basictypes

fun main() {
    val name: String? = null
    val age: Int? = null
    var number1: Int? = null
    val number2: Nothing? = null

/*---------------------------------------------------------*/
    var longNumber1 = number1?.toLong()
    //This line of code above represents the below representation.
    if (number1 == null) {
        print("long number is null")
    } else {
        longNumber1 = number1.toLong()
    }
}
/*---------------------------------------------------------*/







