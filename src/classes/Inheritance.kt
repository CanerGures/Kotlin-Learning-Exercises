package classes

open class Shape {
    open val shape: String = "Empty"
    open val color: String = "Blue"
    open var edge = 0

    open fun draw() {
        println(shape)
    }

    fun fill() {

    }
}

class Rectangle : Shape() {

    override val shape: String
        get() = """
           **********
           *        *
           **********
        """.trimIndent()

}

class Triangle : Shape() {

//    init {
//       fill()
//   }

    override val shape: String
        get() = """
          *
         ***
        *****
    """.trimIndent()

}

class Square : Shape()

open class Daire constructor(override val shape: String) : Shape() {

    protected var number: Int = 3

    override val color: String = "Black"

    override var edge: Int
        get() = super.edge
        set(value) {}

//    fun fill(){
//
//    }
}

class Circle : Daire("Circle") { // Extending is not allowed if the extended class is private

    private val grandpa =
        Daire("asdasd") // While class is private, it is allowed to create an instance in a different class in the same file.But this instance itself has to be private

    override val color: String
        get() = super.color

    fun printColor() {
        println(color)
        number = 4
    }
}

class FinalShape {

    open val name: String = ""

//    override val name : String = "asdasd"// you cannot override because class cannot be inherited.
}

fun main() {
    val triangle = Triangle()
    val rectangle = Rectangle()
    val square = Square()
    val daire = Daire("O") // Creating a public object in main is allowed, if it is in the same file.
    val circle = Circle()

    triangle.draw()
    rectangle.draw()
    square.draw()
    println(daire.color)
    circle.printColor()
}
//if you want to extend a class you should put "open" keyword to class. In kotlin classes
//are non extendable by default(final keyword)."Private" and "final" are not same thing. Private is about visibility
// of the class. but final keyword is about non extendability of the class.