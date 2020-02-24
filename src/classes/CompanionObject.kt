package classes

const val name = "caner"

class Photo {


    val photoUrl1 = "${BASE_URL} fdfasdasdasdasdasdasdsdasdd"
    val photoUrl2 = "${BASE_URL} sdfasdasdasdasdasdasdsdasdd"
    val photoUrl3 = "${BASE_URL} ahgjdasdasdasdasdasdsdasdd"
    val photoUrl4 = "${BASE_URL} ahdfbsdasdasdasdasdsdasdd"

    fun printAll() {
        photoUrl1.log()
        photoUrl2.log()
        photoUrl3.log()
        photoUrl4.log()

    }

    companion object Comrade {
        var BASE_URL = "www.google.com.tr/"
        @JvmStatic
        var BASE_URL2 = "www.google.com.tr"

        fun print() {

        }
    }
}

fun main() {
    val photo = Photo()
    photo.printAll()

    Photo.BASE_URL = "www.yandex.com.tr"
    Photo.BASE_URL2 = "www.yandex.com.tr/"

    val photo2 = Photo()
    photo2.printAll()


}

