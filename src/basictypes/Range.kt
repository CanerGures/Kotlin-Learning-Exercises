package basictypes

fun main() {
    val numbers = 1..100 // [1,100]
    val numbers2 = 1.rangeTo(100)

    val alphabet = 'A'..'Z'

    val reversedNumbers = 100.downTo(1)
    val reversedNumbers2 = 100 downTo 1
    print("reversedNumbers")
    reversedNumbers.forEach { print(" " + it) }
    println()

    val gradeNumbers = 10.until(100) // [10,100)
    val gradeNumbers2 = 10 until 100
    print("gradeNumbers")
    gradeNumbers.forEach { print(" " + it) }
    println()

    val stepptedNumbers = 1..100 step (3)
    val stepptedNumbers2 = 1..100 step 3
    print("stepedNumbers")
    stepptedNumbers.forEach { print(" " + it) }
    println()

    val reversedStepNbr = 100 downTo 1 step (3)
    val reversedStepNbr2 = 100.downTo(100) step 2
    print("reversedStepedNumbers")
    reversedStepNbr.forEach { print(" " + it) }
    println()

    val numberlist: IntRange = 10..100
    numberlist.first
    numberlist.last
    numberlist.step

    when (10) {
        in numberlist -> {
            println("10 is in range")
        }
    }


}