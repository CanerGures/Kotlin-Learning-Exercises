package functions

import java.util.*
import kotlin.concurrent.schedule

fun main() {
    val surName: String = "güreş"
    printUserinfo(getName(), { surName ->
        "surname : $surName"
    }, getAge())

    getItemClick { buttonName ->
        println("$buttonName initiating..")

    }

    //-------------HigherOrderfucntions can be used like normal variable assign below-----
    val higherOrderFunc = { surName: String ->
        "surname : $surName"
    }
    printUserinfo(getName(), higherOrderFunc, getAge())
    //-----------------------------------------------------------------------------------


    val news = News()
    val newsType = NewsType()
    news.getNamesFromServer("FoxTv", newsType) {
        println(this.toString())
    }
    // both usage is available.
//    news.getNamesFromServer("FoxTv", newsType, {
//        println(this.toString())
//    })
}


fun getName(): String {
    return "caner"
}

//First class citizen: if a variable is can be used as return type, method paramater or variables.
// because of that variables are a FCS.In kotlin functions are also a FCS. if you can write the whole function
// inside the function call as a parameter then this functions are a FCS. Converting functions to this type is called higher order functions
fun getAge(): Int = 24

//fun printUserInfo(name:String, age: Int){
//    println("name: $name, age: $age")
//}

fun printUserinfo(name: String, getSurname: (surName: String) -> String, age: Int): Unit {
    println("name: $name, age: $age")

    println(getSurname("güreş"))
}

fun getItemClick(onClick: (buttonName: String) -> Unit) {
    println("Click in progress")
    Timer().schedule(3000) {
        onClick("login")
        println("Click in done..")
    }

}

class News {
    fun getNewsType(newsType: NewsType): String {
        return when (newsType.toString()) {
            NewsType.breakingNews -> "Breaking"
            NewsType.urgent -> "Urgent"
            NewsType.local -> "Local"
            NewsType.global -> "Global"
            else -> "Normal"
        }
    }
}

class NewsType {
    companion object {
        val breakingNews = "BreakinNews"
        val urgent = "Urgent"
        val local = "Local"
        val global = "Global"
    }
}

fun News.getNamesFromServer(channelType: String, newsType: NewsType, getNews: NewsType.(newsType: Int) -> Unit) {

    when (channelType) {
        "KanalD" -> {
            getNews(newsType, 1)
        }
        "ShowTV" -> {
            getNews(newsType, 2)
        }
        "FoxTV" -> {
            getNews(newsType, 3)
        }
        "CNN" -> {
            getNews(newsType, 4)
        }

    }
}