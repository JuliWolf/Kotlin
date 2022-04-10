package `7_Interfaces`

// Interfaces can not have state
// Interfaces can have method realization
// It is possible to implement multiple interfaces
// Not possible to create an instance from Interfaces

interface Drivable {
  val maxSpeed: Double
  fun drive (): String
  fun brake () {
    println("The drivable is braking")
  }
}

open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable {

  open var range: Double = 0.0

  fun extendRange (amount: Double) {
    if (amount > 0) {
      range += amount
    }
  }

//  override fun drive(): String {
//    return "driving the interface drive"
//  }
  //  short version
  override fun drive(): String = "driving the interface drive"

  open fun drive (distance: Double) {
    println("Drove for $distance KM")
  }
}

class ElectricCart (maxSpeed: Double, name: String, brand: String, batteryLife: Double): Car(maxSpeed, name, brand) {
  var chargeType = "Type1"

  override var range = batteryLife * 6

  override fun drive(distance: Double) {
    println("Drove for $distance KM on electricity")
  }

  override fun drive(): String {
    return "Drove for $range KM on electricity"
  }

  override fun brake() {
    super.brake()
    println("Brake inside of electric car")
  }
}

fun main() {
  var audi3 = Car(200.0, "A3", "Audi")
  var teslaS = ElectricCart(240.0, "S-model", "Tesla", 30.0)
  teslaS.chargeType = "Type2"
  teslaS.extendRange(200.0)

  teslaS.drive()
  teslaS.brake() // The drivable is braking // Brake inside of electric car
  audi3.brake() // The drivable is braking

//  Polymorphism
  audi3.drive(200.0) // Drove for 200.0 KM
  teslaS.drive(200.0) // Drove for 200.0 KM on electricity.
}