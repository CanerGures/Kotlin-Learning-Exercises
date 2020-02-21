package classes

// a data class cannot be abstract, open, sealed, inner
//you can take inherit from another class inside data class, and can implement interface
data class BankAccount(
    val accountName: String,
    val accountSurname: String,
    val accountType: String = "Default Value",
    val branchName: String = "Default Value",
    val branchCode: String = "Default Value"
) {


    fun printlog() {
        accountName
    }
}

class BankAccount2(val accountName: String) {
    val accountType: String = "Default Value"
    val branchName: String = "Default Value"
    val branchCode: String = "Default Value"


    fun printlog() {
        accountName
    }
}

class AccountNonData(val accountName: String) {
    var accountType = "Default Value"
    var brancName = "Default Value"
    var branchCode = "Default Value"
    var brancNumber = "Default Value"

    fun printLog() {
        accountName
    }

//    override fun toString(): String {
//        return super.toString()
//    }

//    fun copy(){
//
//    }
}

fun main() {
    val account = BankAccount(
        "caner",
        "güreş",
        "bankaccount",
        "nilüfer",
        "5454"
    )
    val acccount3 = BankAccount(
        "berat",
        "güreş",
        "bankaccount",
        "nilüfer",
        "5454"
    )

    val copyaccount: BankAccount = account.copy("John")
//"copy" method use primary constructor only. If there is something else in
// the body of data class it does not change it even if there is a created instance of data
// class. we did same thing with single line code ,account.copy(line 38), and "val account(line 27)"

    val account2 = BankAccount2("Jane Doe")
    var copyAccount2: BankAccount2

    account.equals(account)
    account2.equals(account2)

    println(account.hashCode())
    println(account2.hashCode())

    println(account.toString())
    println(account2.toString())

//copy ,equals, to string and hashcode methods only takes primary constructor parameters.
    val pair = Pair<String, Int>("caner", 29)
    pair.first
    pair.second

    val triple = Triple<String, String, Int>("caner", "grs", 29)
    triple.first
    triple.second
    triple.third

    val tripList = arrayOf(
        Triple("caner", "grs", 24),
        Triple("caner", "grs", 24),
        Triple("caner", "grs", 24),
        Triple("caner", "grs", 24)
    )

    tripList.forEach {
        it.first
    }

    // desturctTuring declaration value
    val (accountName2, accountSurname2, accountType2, brancName2, branchCode2) = BankAccount(
        "Caner",
        "Grs",
        "BankAccount",
        "Kadıköy",
        "0024"

    )

    val (accountName, accountSurname, accountType, brancName, branchCode) = account
//    val accountName = accountDataInstance1.accountName
//    val accountSurname2 = accountDataInstance1.accountSurname
//    val accountType = accountDataInstance1.accountType
    println("accountName : $accountName")
}

