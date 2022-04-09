package `2_Classes-and-objects`

fun main() {
//  Creating instances of class
  val julia: Person = Person("Julia", "Wolf")
  val john: Person = Person()
  val johnPeterson: Person = Person(lastName = "Peterson")
}

//class Person constructor (firstName: String, lastName: String) {
//
//}

// Alternative
// use `=` to set default values
class Person (firstName: String = "John", lastName: String = "Doe") {

//  Initializer Block
  init {
    println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
  }
}