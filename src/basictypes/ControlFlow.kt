package basictypes

fun main() {
    println("Öğrenci misin?")
    val answer = readLine()!!

    if (answer.toLowerCase() == "evet") {
        println("Öğrenci")

    } else {
        println("Öğrenci değil")
    }
    val grade = readLine()!!.toDouble()

    val isStudent = false
    // you can assign result of the if else expression to a variable (ternary operator)
    val name = if (isStudent) "true" else "false"


    if (grade <= 100 && grade >= 85) {
        println("AA")
    } else if (grade <= 85 && grade >= 70) {
        println("BB")
    } else if (grade <= 70 && grade >= 55) {
        println("CC")
    } else if (grade <= 55 && grade >= 40) {
        println("DD")
    } else {
        println("FF")
    }

    if (10 == 10L.toInt()) {
        println("true")
    }
    val number = if (isStudent) {
        println("true")
        42
    } else {
        23
    }


}