package `1_Variables`

fun main () {
//  Could be reassigned (mutable)
//   var myName = "Julia"
//  myName = "Heidi"

//  Could not be reassigned (immutable)
  val myName = "Julia"
//  myName = "Heidi" // Error

  print("Hello " + myName)

//  NOTE: Type inference finds out the type from the context
  // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
  val myByte: Byte = 13
  val myShort: Short = 125
  val myInt: Int = 123123123
  val myLong: Long = 12_039_812_309_487_120

  // Floating Point number Types: Float (32 bit), Double (64 bit)
  val myFloat: Float = 13.37F
  val myDouble: Double = 3.14159265358979323846

  // Booleans the type Boolean is used to represent logical values.
  // It can have two possible values true and false.
  var isSunny: Boolean = true
  // not sunny anymore...
  isSunny = false

  // Characters
  val letterChar = 'A'
  val digitChar = '1'

  // Strings
  val myStr = "Hello World"
  var firCharInStr = myStr[0]
  var lastCharInStr = myStr[myStr.length - 1]
}
