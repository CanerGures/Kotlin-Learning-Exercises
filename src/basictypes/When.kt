package basictypes

fun main() {
    val countrycode = readLine()!!
    when (countrycode.toLowerCase()) {
        "tr" -> println("TC Citizen")
        "ar" -> println("Arab Citizen")
        "ru" -> println("Russian Citizen")
        "uk" -> println("United Kingdom Citizen")
        "fr" -> println("France Citizen")
    }

    when {
        countrycode.toLowerCase() == "tr" && countrycode.toLowerCase() == "az" -> println(println("TC Vatandaşı"))
        countrycode.toLowerCase() == "ar" -> println("Arab Citizen")
        countrycode.toLowerCase() == "fr" -> println("France Citizen")
        countrycode.toLowerCase() == "ru" -> println("Russian Citizen")
    }

    if (countrycode.toLowerCase() == "tr" || countrycode.toLowerCase() == "az")
        println(println("TC Citizen"))
    else if (countrycode.toLowerCase() == "ar")
        println("Arab Citizen")
    else if (countrycode.toLowerCase() == "fr")
        println("France Citizen")
    else if (countrycode.toLowerCase() == "ru")
        println("Russian Citizen")

    //you must use curly bracet{} if you want to use more than one line

    var countryCode2: String = if (countrycode.toLowerCase() == "tr" || countrycode.toLowerCase() == "az") {
        println("Turki Citizen")
        "90"
    } else if (countrycode.toLowerCase() == "ar") {
        println("Arab Citizen")
        "80"
    } else if (countrycode.toLowerCase() == "fr") {
        println("France Citizen")
        "60"
    } else if (countrycode.toLowerCase() == "ru") {
        println("Russian Citizen")
        "50"
    } else if (countrycode.toLowerCase() == "uk") {
        println("United Kingdom Citizen")
        "40"
    } else {
        "30"
    }


    countryCode2 = when (countryCode2.toLowerCase()) {
        "tr", "az" -> {
            println("TC Citizen")
            "90"
        }
        "ar" -> {
            println("Arab Citizen")
            "80"
        }
        "fr" -> {
            println("France Citizen")
            "70"
        }
        "ru" -> {
            println("Russian Citizen")
            "60"
        }
        "uk" -> {
            println("United Kingdom Citizen")
            "50"
        }
        else -> {
            "40"
        }
    }
    countryCode2 = when (countryCode2.toLowerCase()) {
        "tr", "az" -> {
            println("TC Citizen")
            "90"
        }
        "ar" -> {
            println("Arab Citizen")
            "80"
        }
        "fr" -> {
            println("France Citizen")
            "70"
        }
        "ru" -> {
            println("Russian Citizen")
            "60"
        }
        "uk" -> {
            println("United Kingdom Citizen")
            "50"
        }
        else -> {
            "40"
        }
    }

    val trCode = "tr"
    val arCode = "ar"
    val frCode = "fr"
    val ruCode = "ru"
    val ukCode = "uk"
    when (countrycode.toLowerCase()) {
        trCode, "az" -> println("TC Citizen")
        arCode -> println("Arab Citizen")
        frCode -> println("France Citizen")
        ruCode -> println("Russian Citizen")
        ukCode -> println("United Kingdom Citizen")
    }

    when (readLine()!!.toInt()) {
        in 0..10 -> {
            println("long value")
        }
        in 11..20 -> {
            println("long value")
        }
        !in 11..20 -> {
            println("long value")
        }
    }

    val phoneNumber: Long = 5316266922
    when (phoneNumber) {
        is Long -> {
            println("Long value")
        }
        !is Long -> {
            println("Long value")
        }
    }


}