package `3_Scope`

// variable in file scope, available in whole file
//var b = 3
fun main() {
  myFunction(5)
//  b = 3 // unresolved reference
}

// this a is a parameter
fun myFunction (a: Int) {
//  parameter could not be reassigned
//  a = 5

//  a is a variable
//  var a = 4
//  println("a is $a") // 4

  var b = a
  println("b is $b")
}