// --- constructor
//class Person constructor()

// --- Alternative syntax
//class Person (_firstName: String, _lastName: String) {
//    val firstName: String = _firstName
//    val lastName: String = _lastName
//
////    init block runs any time
////    There could be multiple init block
////    init {
////        firstName = _firstName
////        lastName = _lastName
////    }
//}

// --- Initialize property directly
//class Person (val firstName: String, val lastName: String) {
//    init {
//        println("init 1")
//    }
//
////    --- secondary constructor
////    --- default values
//    constructor(): this("Peter", "Parker") {
//        println("Secondary constructor")
//    }
//
//    init {
//        println("init 2")
//    }
//}

// --- Default values
class Person (val firstName: String = "Peter", val lastName: String = "Parker") {

}