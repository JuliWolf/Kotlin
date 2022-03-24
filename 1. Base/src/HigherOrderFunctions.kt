/* -------------- HOC Functions -------------- */

// Hoc function return another function
// or
// take another function as perimeter values

//fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
//    list.forEach {
//        if (predicate(it)) {
//            println(it)
//        }
//    }
//}

// --- if we not sure that method will be received
fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
//      --- check if it is callable
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

// --- store functions as variables
val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

// --- Hoc which return function
fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith("J") }
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript")
//    printFilteredStrings(list) {
//        it.startsWith("J")
//    }
//
//    printFilteredStrings(list, predicate)
//    printFilteredStrings(list, null)

    printFilteredStrings(list, getPrintPredicate())
}
