package classes

// collection of data and instructions which have a name
class AppUser (
//  Class constructor
//  class can contain properties
  val name: String,
  val joinDate: String,
  val proVersion: Boolean
) {
//  Class body, which you include functions and variables
  fun getFirstInitial(): Char {
    return name[0]
  }
}

// It adds several automatically generated functions to the class you it to
// equals(), hashcode(), toString(), copy()
data class User (
  val uid: String,
  val name: String = "",
//  default value
  val profilePicUrl: String = "satellite_beam"
)

fun main() {
//  To create a class
  val aUser = AppUser(
    "Ryan",
    "Now",
    false
  )

  val user = User(
    "123456",
    "Jeremy"
  )

  val otherUser = User(
    uid = "1234567",
    profilePicUrl = "selfie.jpg"
  )
}

// Cohesion: The degree to which things belong together

// Cohesive Class
class DogOne (
  val age: Int,
  val weight: Double,
  val height: Double,
  val name: String,
  val owner: User
) {
  fun makeNoise () {
    println("Bark!")
  }
}

// Not Cohesive
class DogTwo (
  val bankAccountNumber: Int,
  val letterGrade: String,
  val fluentInGerman: Boolean
) {
  fun measureGravity () {
    println("Bark!")
  }
}