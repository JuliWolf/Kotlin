interface PersonInfoProvider {
//    --- interfaces can provide options
    val providerInfo: String

//    --- interfaces can contain implementation
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

// --- implement interface `PersonInfoProvider`
// --- `open` means that we can inherit from this class
//open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
//    override val providerInfo: String
//        get() = "BasicInfoProvider"
//
////    --- We can override default implementation
//    override fun printInfo(person: Person) {
//        super.printInfo(person)
//        println("additional print statement")
//    }
//
//    override fun getSessionId(): String {
//        return "Session"
//    }
//}


/* -------------- Use classes -------------- */

//fun main() {
//    val provider = BasicInfoProvider()
//    provider.printInfo(Person())
//    provider.getSessionId()
//
//    checkTypes(provider)
//}
//
//// --- Check instance type
//fun checkTypes (infoProvider: PersonInfoProvider) {
////    --- not is
//    if (infoProvider !is SessionInfoProvider) {
//        println("not a session info provider")
//    }else {
//        println("is a session info provider")
//
////      --- cast to another type
////        (infoProvider as SessionInfoProvider).getSessionId()
////      --- smart cast to another type
//        infoProvider.getSessionId()
//    }
//}


/* -------------- Use classes with inheritance -------------- */

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

//  --- give access for children classes
//  --- by default value is public
    protected open val sessionIdPrefix = "Session"

    //    --- We can override default implementation
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}
//
//fun main() {
//    val provider = FancyInfoProvider()
////    provider.sessionIdPrefix
//
//    provider.printInfo(Person())
//    provider.getSessionId()
//}


/* -------------- Object expressions -------------- */

fun main() {
//  --- extend class `PersonInfoProvider`
//  --- anonymous inner class
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New info provider"

//      --- add new method
        fun getSessionId() = "id"
    }

    provider.printInfo(Person())
    provider.getSessionId()
}