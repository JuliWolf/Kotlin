package `8_Unsafe-and-Safe-cast-operator`

// --- Unsafe cast operator `as` ---

// Sometimes it is not possible to cast a variable and it throws an exception, this is called an unsafe cast

// The unsafe cast is performed by the infix operator `as`


//fun main() {
////  val obj: Any? = null
////  val str: String = obj as String
////  println(str) // Exception in thread "main" ClassCastException
//
//  val obj: Any? = "String unsafe cast"
//  val str: String? = obj as String
//  println(str) // Works
//}


// --- Safe cast operator `as?` ---

// `as?` provides a safe cast operator to safely cast to a type

// It returns a null if casting is not possible rather than throwing an ClassCastException exception


fun main() {
  val location: Any = "Kotlin"
  val safeString: String? = location as? String
  val safeInt: Int? = location as? Int
  println(safeString) // Kotlin
  println(safeInt) // null
}