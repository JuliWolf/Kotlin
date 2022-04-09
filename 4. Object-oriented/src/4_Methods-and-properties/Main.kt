package `4_Methods-and-properties`

fun main() {
  val julia: Person = Person("Julia", "Wolf", 26)
  julia.hobby = "to skateboard"
  julia.stateHobby()

  var john = Person()
  john.hobby = "play video games"
  john.stateHobby()
}

class Person (firstName: String = "John", lastName: String = "Doe") {
  //  Member Variables - Properties
  var age: Int? = null
  var hobby: String = "watch Netflix"

  var firstName: String? = null

  init {
    this.firstName = firstName

    println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
  }

//  Member secondary constructor
  constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
    this.age = age
    println("Initialized a new Person object with firstName = $firstName and lastName = $lastName and age $age")
  }

//  Member functions - Methods
  fun stateHobby () {
    println("$firstName\'s hobby is $hobby")
  }
}