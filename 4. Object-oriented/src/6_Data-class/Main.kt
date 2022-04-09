package `6_Data-class`

fun main() {
  val firstUser = User(1, "Julia")

//  val name = firstUser.name
//  println(name)
//  firstUser.name = "Michel"
//
//  val secondUser = User(1, "Michel")
//  println(firstUser == secondUser) // true
//
//  println("User derails: $firstUser")
//
  val updatedUser = firstUser.copy(name = "Denis")
  println(firstUser) // User(id=1, name=Michel)
  println(updatedUser) // User(id=1, name=Denis)
//
//  println(firstUser.component1()) // 1
//  println(firstUser.component2()) // Michel

//  Deconstruction
  val (id, name) = updatedUser
//  the same as
//  val id = updatedUser.id
//  val name = updatedUser.name
  println("id=$id, name=$name")

}

// Data class must at least have one parameter
// Data class cannot be abstract, open, sealed or other classes
data class User (val id: Long, var name: String)