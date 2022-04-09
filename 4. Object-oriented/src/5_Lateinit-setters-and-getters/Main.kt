package `5_Lateinit-setters-and-getters`

fun main() {
  var myCar = Car()
  //  is value was not initialized
  // Error: UninitializedPropertyAccessException
  myCar.owner

  println("brand is ${myCar.owner}")

  myCar.maxSpeed = 200
  println("Max Speed is ${myCar.maxSpeed}")

  // Error: IllegalAccessException
//  myCar.maxSpeed = -5

  // Error: the setter is private in 'Car'
//  myCar.myModel = "M3"

  println("Model is ${myCar.myModel}")
}

class Car () {
//  to tell that this value will be initialized later
  lateinit var owner: String

  val myBrand: String = "BMW"
// Custom getter
    get () {
      return field.toString()
    }

  var maxSpeed: Int = 250
    set (value) {
      field = if (value > 0) value else throw IllegalAccessException("Max speed could not be less than 0")
    }
// Automatically generated code
//    get() = field
//    set (value) {
//      field = value
//    }

  var myModel: String = "M5"
//    only available within this class
    private set

  init {
    this.myModel = "M3"
    this.owner = "Frank"
  }
}