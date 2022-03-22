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
// *** Note: By default all classes, options and function are public
class Person (val firstName: String = "Peter", val lastName: String = "Parker") {
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    fun printInfo () {
//        val nickNameToPrint = if (nickName != null) nickName else "no nickname"
//        --- If left side then left side else right
        val nickNameToPrint = nickName ?: "no nickname"

        println("$firstName ($nickNameToPrint) $lastName")
    }
}

// --- Access Modifiers

// Class

//- Public - full access
//- Internal - public access within the module
//- Private - only available within the file in which it is implemented

// Value and Methods

//- Protected - available only within that class or subclasses
//- Private - available only within that class