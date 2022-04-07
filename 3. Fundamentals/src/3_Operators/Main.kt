package `3_Operators`

fun main() {
  // Arithmetic operators (+, -, *, /, %)
  // 1. +
  // 2. -
  // 3. *
  // 4. /
  // 5. %

  var result = 5 + 3
  result = result / 2
  // alternatively
  // result /= 2

  result = result * 5
  // alternatively
  // result *= 5

  result = result - 1
  // alternatively
  // result -= 1

  var moduloResult = 5 % 2
  println(moduloResult)


  // Comparison operators (==, !=, <, >, <=, >=)
  // 1. ==
  // 2. !=
  // 3. <
  // 4. >
  // 5. <=
  // 6. >=

  val isEqual = 5 == 3
  // Concatenation - adding of "Strings"
  println("isEqual is " + isEqual)
  val isNotEqual = 5 != 5

  // Kotlin has a feature called String Interpolation.
  // This feature allows you to directly insert a template expression inside a String.
  // Template expressions are tiny pieces of code that are evaluated and
  // their results are concatenated with the original String.
  // A template expression is prefixed with $ symbol.
  // Following are examples of String interpolation
  println("isNotEqual is $isNotEqual")

  println("is5Greater3 ${5 > 3}")
  println("is5LowerEqual3 ${5 >= 3}")
  println("is5LowerEqual5 ${5 >= 5}")


  // Assignment operators (+=, -=, *=, /=, %=)
  // 1. +=
  // 2. -=
  // 3. *=
  // 4. /=
  // 5. %=

  var myNum = 5
  myNum += 3
  println("myNum is $myNum")
  myNum *= 4
  println("myNum is $myNum")


  // Increment & Decrement operators (++, --)
  // 1. ++
  // 2. --

  myNum++
  println("myNum is $myNum")
  // increments after use
  println("myNum is ${myNum++}")
  // increments before use
  println("myNum is ${++myNum}")
  println("myNum is ${--myNum}")
}