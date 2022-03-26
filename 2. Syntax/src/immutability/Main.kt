package immutability

// compile time constant
internal const val ERROR_MESSAGE = "An error has occurred."

private const val ADD = "+"

// read-only reference
val heightInCM: Double = 182.0
val userName: String = "Bob"

// the arguments to function in Kotlin are val by default
fun doSomething(argument: String) {
//  argument = "Blah" // error: val cannot be reassigned
}


var playerLocationX: Double = 0.0
var playerLocationY: Double = 0.0

fun renderFrame (moveX: Double, moveY: Double) {
  playerLocationX += moveX
  playerLocationY += moveY
}