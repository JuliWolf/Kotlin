package Separation

// Bad example
fun main() {
  val mathOperator = "/"
  val firstValue = "5"
  val secondValue = "6"

  var validArguments: Boolean
  var operandOne: Double = 0.0
  var operandTwo: Double = 0.0

  validArguments = when (mathOperator) {
    "+" -> true
    "-" -> true
    "/" -> true
    "*" -> true
    else -> false
  }

  if (firstValue.toDoubleOrNull() == null) validArguments = false
  else operandOne = firstValue.toDouble()

  if (secondValue.toDoubleOrNull() == null) validArguments = false
  else operandTwo = secondValue.toDouble()

  if (validArguments) {
    val result: String

    when (mathOperator) {
      "+" -> result = (operandOne + operandTwo).toString()
      "-" -> result = (operandOne - operandTwo).toString()
      "/" -> result = (operandOne / operandTwo).toString()
      "*" -> result = (operandOne * operandTwo).toString()
      else -> result = "An error has occurred."
    }

    println(result)
  } else {
    println("An error has occurred.")
  }
}