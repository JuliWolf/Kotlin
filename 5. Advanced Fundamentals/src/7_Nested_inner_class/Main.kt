package `7_Nested_inner_class`

// --- NESTED CLASS ---

// Nested class is such class which is created inside another class

// Int Kotlin, a nested class is by default static, so its data members and member functions can be accessed without creating an object of the class

// Nested classes cannot access the data members of outer class


//class OuterClass {
////  outer class code
//
//  private var name: String = "Mr X"
//
//  class NestedClass {
//    var description: String = "code inside nested class"
//    private var id: Int = 101
//
//    fun foo () {
////      println("name is ${name}") // cannot access the outer class member
//      println("Id is ${id}")
//    }
//  }
//}

//fun main() {
////  Nested class must be initialized
////  println(OuterClass.NestedClass.description)
//
//  var obj = OuterClass.NestedClass()
//  obj.foo() // access member function
//}


// --- INNER CLASS ---

// An inner class is a class which is created inside another class with keyword inner

// In other words, we can say that a nested class which is marked as "inner" is called inner class

// Inner class cannot be declared inside or non-inner nested classes

// The advantage of inner class over nested class is that, it is able to access members of its outer class event it is private


class OuterClass {
  private var name: String = "Mr X"

  inner class InnerClass {
    var description:String = "code inside inner class"
    private var id: Int = 101
    fun foo () {
      println("Name is ${name}") // access the private outer class member
      println("Id is ${id}")
    }
  }
}

fun main() {
  println(OuterClass().InnerClass().description) // accessing property
  var obj = OuterClass().InnerClass() // object creation
  obj.foo() // access member function
}
