package Restrictions

// Result Wrapper (Either Monad)
sealed class Result {
//  All classes inside sealed class extends Result

//  For events, we create a class or object. Object work when we don't need any data
  object Loading: Result ()
  object Error: Result()
  data class Success (val value: String): Result()
}

// mimic an interaction between different components of a program
fun requestData () {
  val result = InputOutputDevice.getData()

  when (result) {
    is Result.Error -> UserInterface.showErrorMessage()
    is Result.Loading -> UserInterface.showLoadingScreen()
    is Result.Success -> UserInterface.showData(result.value)
  }
}

object InputOutputDevice {
  fun getData (): Result {
    return Result.Success("Oh yeah")
  }
}

object UserInterface {
  fun showLoadingScreen() {

  }

  fun showData(data: String) {

  }

  fun showErrorMessage() {

  }
}

enum class MathematicalOperator (val op: Char) {
  PLUS('+'),
  MINUS('-'),
  DIVIDE('/'),
  MULTIPLY('*')
}

// Function Type
fun checkOperator (op: MathematicalOperator): (Double, Double) -> Double {
  return when (op) {
//    lambda expression (arguments -> body of the lambda expression)
    MathematicalOperator.PLUS -> { x, y -> x + y }
    MathematicalOperator.MINUS -> { x, y -> x - y }
    MathematicalOperator.DIVIDE -> { x, y -> x / y }
    MathematicalOperator.MULTIPLY -> { x, y -> x * y }
  }
}

fun main() {
  val mathFunction = checkOperator(MathematicalOperator.DIVIDE)

  println(
    mathFunction(4.0, 4.0)
  )
}