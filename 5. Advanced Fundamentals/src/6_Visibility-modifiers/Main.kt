package `6_Visibility-modifiers`

// Visibility modifiers are the keywords which are used to restrict the use of classes, interfaces, methods, and properties in Kotlin

// These modifiers are used at multiple places such as class header or method body

// Visibility Modifiers are categorized into four different types:

// - public
// - private
// - protected
// - internal


// --- PUBLIC ---

// A public modified elements is accessible from everywhere in the project

// It is a default modifier in Kotlin.
// If any class, interface etc. are not specified with any access/visibility modifier then that class, interface etc. is used in a public scope

// All public declarations can be placed at the top of the file.

// If a member of a class is not specified then it is by default public


//public class Example {}

// public by default
class Demo {}

//public fun hello()

// public by default
//fun demo()

public val x =  5

// public by default
//val y = 10;


// --- PRIVATE ---

// A private modifier allows the element to be accessible only within the block in which properties, fields, etc. are declared

// The private modifier declaration does not allow access outside the scope

// A private package can be accessible within that specific file


// Tha class "Example" is accessible from the same source file
// val "x" and "fun doSomething" are accessible within Example class
//private class Example {
//  private val x = 1;
//
//  private fun doSomething(){}
//}


// --- INTERNAL ---

// The internal modifier is feature in Kotlin, which is not available in Java

// The internal modifier makes the field visible only inside the module in which it is implemented

// All fields are declared as internal which are accessible only inside the module in which they are implemented

internal class Example {
  internal val x = 5

  internal fun getValue () {
  }
}

internal val y = 10


// --- OPEN keyword ---

// In Kotlin all classes final by default, so they can't be inherited by default

// To make a class inheritable to other classes you must mark it with the open keyword, else you get an error "type is final so can't be inherited"


// --- PROTECTED ---

//A protected modifier with a class or an interface allows visibility to its class or subcalss only

// A protected declaration (when overridden ) in its subclass is also protected unless it is explicitly changed

// The Protected modifier CANNOT be declared at top level (for Packages)

//open class Base {
//  protected val i = 0
//}
//
//class Derrived: Base () {
//  fun getValue(): Int {
//    return i
//  }
//}

open class Base {
  open protected val i = 0
}

class Derrived: Base () {
  fun getValue(): Int {
    return i
  }

  override val i = 10
}

class Another: Base () {
  fun getValue(): Int {
    return i
  }

  override val i = 10
}

