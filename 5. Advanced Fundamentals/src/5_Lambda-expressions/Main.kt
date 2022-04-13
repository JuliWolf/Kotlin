package `5_Lambda-expressions`

fun main() {
//  Lambda (Expressions) is a function which has no name

//  Lambda expressions and anonymous functions are 'functions literals',
//  i.e. functions that are not declared, but passed immediately as an expression

//  Lambda is defined with curly braces {} which takes variables as parameters (if any) and a body of a function

//  The body of a function is written after the variable (if any) followed by -> operator

//  Base function
  addNumber(5, 10) // 15

  val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
  println(sum(10, 5)) // 15

//  Short variant
  val shortSum = {a: Int, b: Int -> println(a + b)}
  shortSum(10, 5) // 15
}

fun addNumber (a: Int, b: Int) {
  val add = a + b
  println(add)
}