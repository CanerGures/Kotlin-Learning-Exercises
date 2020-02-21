package classes

class School : Shape() {
    val schoolName = "Codemy"
    private val schoolType = "Online"

    class LawSchool {
        val studentCount: Int = 5000
        fun printOutherName() {
            //println("outher schoolame : $schoolName") --you cannot reach to these
            // println("outher schoolame : $schoolType") --parameters because it is not inner
        }
    }

    // you can inherit twice with inner class but it will create all instances of extended classes
    inner class MedSchool : Daire("daire") {
        val studentCount: Int = 5000
        fun printOutherName() {
            println("outher schoolame : $schoolName")
        }
    }


}

fun main() {
    val lawSchool = School.LawSchool()
    lawSchool.printOutherName()
    lawSchool.studentCount

    val medSchool = School().MedSchool()
}