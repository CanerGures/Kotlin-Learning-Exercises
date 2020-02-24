package classes


open class TextView(text: String) {
    open val textSize: Int = text.length

}

interface OntextChanged {
    fun textChanged()
}

//you will create object with interface.
fun main() {
    val textView: TextView = object : TextView("asd"), OntextChanged {

        override val textSize: Int
            get() = super.textSize

        override fun textChanged() {

        }

    }

    val studentName = "caner"
    val studentAge = 24

    val student = object {
        val name = "caner"
        val age = 24

        val prepStudent = object {
            val studentID = 1545

        }
    }

    student.age
    student.name

    student.prepStudent.studentID


}