package basictypes

fun main() {

    for (value in 1..10) {
        print("$value")
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")

    for (value in countryCodeArray) {
        print("$value")//prints values
    }
    for (index in countryCodeArray.indices) {
        print("$index . değeri : ${countryCodeArray[index]}")
    }
    for ((index, value) in countryCodeArray.withIndex()) {
        print("$index . değeri : ${countryCodeArray[index]}")
    }
    repeat(10) {
        print("\nLife is short, there are much more places to visit")
    }

    for (value in 1..50) {
        if (value % 2 == 1) {
            continue
        }
        print("\t$value")
    }
    returnhere@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnhere
            }
        }
    }
}