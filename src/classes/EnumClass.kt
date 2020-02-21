package classes

enum class DirectionType(val code: Int) {
    //  EAST,WEST,SOUTH,NORTH
    // if you write abstract inide enum, you must ride override for all value.
    // you cannot inherit or extend the class but you can implement interface

    EAST(100) {
        override fun toString(): String {
            return "East"
        }

        override fun printFullValue() {
            println("name : ${EAST.name}, position: ${EAST.ordinal}")
        }
    },
    WEST(200) {
        override fun toString(): String {
            return "WEST"
        }

        override fun printFullValue() {
            println("name : ${WEST.name}, position: ${WEST.ordinal}")
        }
    },
    SOUTH(300) {
        override fun toString(): String {
            return "SOUTH"
        }

        override fun printFullValue() {
            println("name : ${SOUTH.name}, position: ${SOUTH.ordinal}")
        }
    },
    NORTH(400) {
        override fun toString(): String {
            return "NORTH"
        }

        override fun printFullValue() {
            println("name : ${NORTH.name}, position: ${NORTH.ordinal}")
        }
    };

    abstract fun printFullValue()
}

fun main() {
    DirectionType.EAST
    DirectionType.SOUTH
    DirectionType.WEST
    DirectionType.NORTH

    setDirection(DirectionType.NORTH.name, DirectionType.NORTH.ordinal)
    setDirection(DirectionType.EAST.name, DirectionType.EAST.ordinal)
    setDirection(DirectionType.WEST.name, DirectionType.WEST.ordinal)
    setDirection(DirectionType.SOUTH.name, DirectionType.SOUTH.ordinal)

    setDirection(DirectionType.NORTH.toString(), DirectionType.NORTH.ordinal)
    setDirection(DirectionType.EAST.toString(), DirectionType.EAST.ordinal)
    setDirection(DirectionType.WEST.toString(), DirectionType.WEST.ordinal)
    setDirection(DirectionType.SOUTH.toString(), DirectionType.SOUTH.ordinal)

    DirectionType.EAST.printFullValue()
    DirectionType.WEST.printFullValue()
    DirectionType.SOUTH.printFullValue()
    DirectionType.NORTH.printFullValue()

    DirectionType.EAST.code.log()
    DirectionType.WEST.code.log()
    DirectionType.SOUTH.code.log()
    DirectionType.NORTH.code.log()


    //IDE knows that you have 4 type in the enum class and it doesn't ask for else block
    val directiontypte = DirectionType.NORTH
    val redirectionType = when (directiontypte) {
        DirectionType.NORTH -> {
            DirectionType.NORTH.toString()
        }
        DirectionType.EAST -> {
            DirectionType.EAST.toString()
        }
        DirectionType.WEST -> {
            DirectionType.WEST.toString()
        }
        DirectionType.SOUTH -> {
            DirectionType.SOUTH.toString()
        }
    }
    val directiontypte2 = "North"
    val redirectionType2 = when (directiontypte2) {
        "North" -> {
            "NORTH"
        }
        "West" -> {
            "WEST"
        }
        "North" -> {
            "SOUTH"
        }
        "East" -> {
            "EAST"
        }
        else -> {
            "You need to write else block with that usage."
        }
    }

//    setDirection("NORTH",1) if you use like that you maybe cannot remember the values
//    setDirection("EAST",2) one or two month ago. Because it is string and cannot save there.
//    setDirection("WEST",3)
//    setDirection("SOUTH",4)

}

fun setDirection(direction: String, position: Int) {
    println("direction $direction, position: $position")
}

fun Int.log() {
    println(this)
}