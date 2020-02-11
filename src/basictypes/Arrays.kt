package basictypes

fun main() {
    val studentNumbers = arrayOf(123, 3253, 35, 75)
    val studentNames = arrayOf("osman", "caner", "suleyman", "derya")
    val firstCharOfNames = arrayOf('O', 'C', 'S', 'D')
    val mixedArray = arrayOf(13, "Hasan", 'G', true)
    val arrayOfNulls = arrayOfNulls<String>(4)

    val carNames = Array<String>(3) { "Lambo" }
    val carNames1 = Array<Int>(10) {
        (it * it) //returns times of every value itself
    }
    val firstCharCountryNames = CharArray(3)
    firstCharCountryNames[0] = 'T'
    firstCharCountryNames.set(1, 'G')
    firstCharCountryNames.set(2, 'F')

    println(firstCharCountryNames[0])
    println(firstCharCountryNames.get(2))


}