package basictypes

fun main() {
    val firstCharOfName: Char = 'C'
    val charNumber: Char = '6'
    val convertedcharnumber = charNumber.toInt()

    println(convertedcharnumber) // this will print ASCII number of value

    //escape characters

    val escapeCharT: Char = '\t' //space like tab
    val escapeCharN: Char = '\n' // new line
    val escapeCharB: Char = '\b' //
    val escapeCharR: Char = '\r'
    val escapeChar1: Char = '\'' //
    val escapeChar2: Char = '\"'
    val escapeCharSlash: Char = '\\'
    val escapeCharDollar: Char = '\$'

    val unicode = '\u2661'

    println("unicode\n" + unicode)


}