package classes

sealed class Fruit {
    class Apple : Fruit()
    class Banana : Fruit()

    object GetFruit : Fruit()
}

fun main() {
    val apple = Fruit.Apple()
    val banana = Fruit.Banana()
    val getFruit = Fruit.GetFruit

    println(apple)
    println(banana)
}

fun getFruit(fruit: Fruit) {
    when (fruit) {
        is Fruit.Apple -> {
            println("apple")
        }
        is Fruit.Banana -> {
            println("banana")
        }
        Fruit.GetFruit -> {
            "asd"
        }
    }
}