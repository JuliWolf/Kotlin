package Functional

fun main() {
  solveExpression(arrayOf("Invalid", "5"))
}

fun getErrorMessage () = "An error has occurred."

/**
 * Takes in an array and attempts to solve it if the items can form a valid expression:
 * 1. Array must have a length of 3
 * 2. First and Second Strings must be valid doubles
 * 3. Third String must be a valid operator
 *
 * True: Solve expression and display result
 * False: Show error message
 */

fun solveExpression (args: Array<String>) {
  if (args.size != 3) {
    println(getErrorMessage())
    return
  }

  if (firstAndSecondNotValid(args[0], args[1])) {
    println(getErrorMessage())
    return
  }

  if (thirdIsNotValid(args[2])) {
    println(getErrorMessage())
    return
  }

  println(solve(
    args[0].toDouble(),
    args[1].toDouble(),
    getOperation(args[2])
  ))
}

fun getOperation (s: String): (Double, Double) -> String {
  return when (s) {
    "+" -> { first: Double, second: Double -> (first + second).toString() }
    "-" -> { first: Double, second: Double -> (first - second).toString() }
    "*" -> { first: Double, second: Double -> (first * second).toString() }
    "/" -> { first: Double, second: Double -> (first / second).toString() }
    else -> { _: Double, _: Double -> getErrorMessage() }
  }
}

// A higher order function, is a function which either accepts another function as an argument, or returns as an argument
fun solve (
  d1: Double,
  d2: Double,
  operation: (Double, Double) -> String
): String = operation.invoke(d1, d2)

fun firstAndSecondNotValid (s1: String, s2: String): Boolean {
  if (s1.toDoubleOrNull() == null) {
    return true
  }

  if (s2.toDoubleOrNull() == null) {
    return true
  }

  return false
}

fun thirdIsNotValid (s: String): Boolean {
  return when (s) {
    "+" -> false
    "-" -> false
    "*" -> false
    "/" -> false
    else -> true
  }
}
