package basictypes

fun main() {
    val name = "History"
    val char = 'H'
    val char1 = 'i'
    val char2 = 's'
    val char3 = 't'
    val char4 = 'o'
    val char5 = 'r'
    val char6 = 'y'
    val nameArray = charArrayOf(char, char1, char2, char3, char4, char5, char6)

    for (char in name) {
        println(char)
    }

    println("Name Of Array :" + nameArray)
    //Same
    println("Name Of Array : $nameArray ")
    val rawPineTree = """
           *
          ***
         ******
        *********
    """
    //spaces behind $ sign will be deleted for all lines with trimIndent
    val rawPineTree2 = """  
                   *
     $             ***
                 ******
                *********
    """.trimIndent()
    //spaces behind $ sign will be deleted for just the line with trimMargin
    println(rawPineTree)
}