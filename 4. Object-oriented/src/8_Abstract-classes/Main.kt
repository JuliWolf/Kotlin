package `8_Abstract-classes`

// Not possible to create an instance from abstract class
// Abstract classes can have abstract properties and methods
// Abstract classes can have method realization
// It is possible to extends from only one abstract class


// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class).
// However, you can inherit subclasses from can them.
// The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.
abstract class Mammal(val name: String, val origin: String,
                      val weight: Double) {   // Concrete (Non Abstract) Properties

  // Abstract Property (Must be overridden by Subclasses)
  abstract var maxSpeed: Double

  // Abstract Methods (Must be implemented by Subclasses)
  abstract fun run()
  abstract fun breath()

  // Concrete (Non Abstract) Method
  fun displayDetails() {
    println("Name: $name, Origin: $origin, Weight: $weight, " +
        "Max Speed: $maxSpeed")
  }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight) {

  override fun run() {
    // Code to run
    println("Runs on two legs")
  }

  override fun breath() {
    // Code to breath
    println("Breath through mouth or nose")
  }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight) {

  override fun run() {
    // Code to run
    println("Runs on four legs")
  }

  override fun breath() {
    // Code to breath
    println("Breath through the trunk")
  }
}

fun main() {
  val human = Human("Denis", "Russia",
    70.0, 28.0)
  val elephant = Elephant("Rosy", "India",
    5400.0, 25.0)

  // ERROR: Cannot create an instance of an abstract class
//  val mammal = Mammal("Julia", "Russia", 55.0, 28)

  human.run()
  elephant.run()

  human.breath()
  elephant.breath()

}