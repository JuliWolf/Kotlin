// create collections of letters
val ADD: String = "+"
val SUBSTRACT: String = "-"
val MULTIPLY = "*"
val DIVIDE = "/"

val ERROR_MESSAGE = "An error has occurred."

// create two test operands to see if program works preperly
val testOperandOne: Double = 5.0
val testOperandTwo = 4.0

fun main(args: Array<String>) {
  val operatorSymbol = args[0]

  start(operatorSymbol)
}

// By default functions return `Unit`
fun start (operatorSymbol: String): Unit {
  if (checkArguments(operatorSymbol)) {
    displayResult(
      evaluateBinomial(testOperandOne, testOperandTwo, operatorSymbol)
    )
  } else {
    displayResult(ERROR_MESSAGE)
  }
}

// Single expression syntax
fun displayResult (result: String) = println(result)

fun evaluateBinomial (one: Double, two: Double, sym: String): String {
  return when (sym) {
    ADD -> (one + two).toString()
    DIVIDE -> (one / two).toString()
    MULTIPLY -> (one * two).toString()
    SUBSTRACT -> (one - two).toString()
    else -> ERROR_MESSAGE
  }
}

fun checkArguments (operatorSymbol: String): Boolean {
//  when (operatorSymbol) {
//    ADD -> return true
//    DIVIDE -> return true
//    MULTIPLY -> return true
//    SUBSTRACT -> return true
//    else -> return false
//  }

//  Alternative
  return when (operatorSymbol) {
    ADD -> true
    DIVIDE -> true
    MULTIPLY -> true
    SUBSTRACT -> true
    else -> false
  }
}