/* -------------- Variables -------------- */

// --- Top level variables
//val globalName: String = "Global Name"
//var greeting: String = "hello"

// --- Null value
//val name: String = null // error
//val name: String? = null

// --- Kotlin can detect type automatically
//var name = "Nate"

// Set nullable variable
//var name = null

//fun main() {
//    var - Could be reassigned
//    val - Could not be reassigned like const
//    var name: String = "Nate"
//    name = ""
//
//    val name1: String = "Poppy"
//
//    println(name)
//    println(name1)

//    println(globalName)
//    println(greeting)
//
//    greeting = "hi"
//    println(greeting)

//    name = null // error because by default variables is not nullable

//    if (greeting != null) {
//        println(greeting)
//    } else {
//       println("Hi")
//    }
//
//    println(globalName)
//}


/* -------------- If-else -------------- */

//val globalName: String = "Global Name"
//var greeting: String? = null

//fun main() {
//    if (greeting != null) {
//        println(greeting)
//    } else {
//       println("Hi")
//    }
//
//    println(globalName)
//}


/* -------------- When-case -------------- */

//var greeting: String? = null
//
//fun main() {
//    greeting = "Hello"
//
//    when(greeting) {
//        null -> println("Hi")
//        else -> println(greeting)
//    }
//}


/* -------------- Ternary conditional -------------- */

//var greeting: String? = null
//
//fun main() {
////    greeting = "hello"
////    val greetingToPrint = if (greeting != null) greeting else "Hi"
////    println(greetingToPrint)
//
//    val greetingToPrint = when (greeting) {
//        null -> "Hi"
//        else -> greeting
//    }
//    println(greetingToPrint)
//}


/* -------------- Functions -------------- */

//fun getGreeting (): String {
//    return "Hello Kotlin"
//}

// Single expression function
//fun getGreeting (): String = "Hello Kotlin"
//fun getGreeting () = "Hello Kotlin"
//
//// return nothing
//fun sayHello (): Unit {
//    println(getGreeting())
//}
//
//// To return null
//fun getNothing (): String? {
//    return null
//}
//
//fun main() {
//    println(getGreeting())
//    sayHello()
//    println(getNothing())
//}


/* -------------- Function parameters -------------- */

//fun main() {
//    sayHello("Kotlin")
//    sayHello("World")

//    Multiple parameters
//    sayHello("Hey", "Kotlin")
//    sayHello("Hello", "World")
//}

//fun sayHello (itemToGreet: String) {
////    val msg = "Hello " + itemToGreet
//
////    String template
////    val msg = "Hello $itemToGreet"
//    println("Hello $itemToGreet")
//}

//fun sayHello (itemToGreet: String) = println("Hello $itemToGreet")

//fun sayHello (greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")


/* -------------- Collections and Iteration -------------- */

//fun main() {
//    --- Arrays
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")

//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))

//    Loop for interestingThings
//    for (interestingThing in interestingThings) {
//        println(interestingThing)
//    }

//    `it` is default item name
//    interestingThings.forEach {
//        println(it)
//    }

//    *** Note: If function is the only required parameter in function we can omit `()`
//    interestingThings.forEach { interestingThing ->
//        println(interestingThing)
//    }

//    interestingThings.forEachIndexed{index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }

//    --- List
//    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
//    println(interestingThings[0])
//
//    interestingThings.forEach { interestingThing ->
//        println(interestingThing)
//    }


//    --- Map
//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//    map.forEach { key, value -> println("$key -> $value") }

//    *** Note: By default all collections are immutable

//    Mutable list
//    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
//    interestingThings.add("Dogs")

//    Mutable map
//    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map.put(4, "d")


//    --- Work with collections
//    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
//    sayHello("Hi", interestingThings)
//}
//
//fun sayHello (greeting: String, itemsToGreet: List<String>) {
//    itemsToGreet.forEach { itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//}


/* -------------- Named arguments & default parameter -------------- */

//fun main() {
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
//
////    Spread operator
//    sayHello("Hello", *interestingThings)
//    sayHello("Hi", "Kotlin", "Programming", "Comic Books")
//}
//
//// `vararg` parameter is treated as array of specified type
//fun sayHello (greeting: String, vararg itemsToGreet: String) {
//    itemsToGreet.forEach { itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//}


// --- Named parameters
// *** Note: We can mix order
//fun main() {
////    greetPerson(name = "Nate", greeting = "Hi")
////    greetPerson()
//
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
//    sayHello(itemsToGreet = interestingThings, greeting = "Hi")
//}
//
//// --- Default parameter values
////fun greetPerson (greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")
//
//fun sayHello (greeting: String, vararg itemsToGreet: String) {
//    itemsToGreet.forEach { itemToGreet ->
//        println("$greeting $itemToGreet")
//    }
//}


/* -------------- Classes -------------- */

fun main() {
//    val person = Person("Nate", "Ebel")
//    person.firstName
//    person.lastName

    val person = Person()
//    person.nickName = "Shades"
//    person.nickName = "New Nickname"
//    println(person.nickName)
    person.printInfo()
}
