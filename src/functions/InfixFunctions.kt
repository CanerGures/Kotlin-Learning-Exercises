package functions

fun main() {
    val isStudent = false
    val isMale = true
    if (!isStudent and isMale) {
        print("öğrenci olmayan erkek")
    }

    val awesomeInstance = AwesomeClass()
    awesomeInstance downloadImage "www.google.com"


}

class AwesomeClass {
    //      you must create a class to create infix method. Also infix methods
    //       doesnt allow to set default parameter "imageUrl : String = "caner" "
    infix fun download(imageUrl: String) {

    }

    infix fun <T> downloadImage(imageUrl: T) {

    }

    fun logWhenImageDownloaded(imageUrl: String) {

        //      this refers to class AwesomeClass. if you want to use this method outside the class
        //      it wont work.This usage is an option when you want to use infix downloadimage inside
        //      another method.
        this downloadImage imageUrl
    }

}