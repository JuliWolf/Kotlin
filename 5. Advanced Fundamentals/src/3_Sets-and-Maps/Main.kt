package `3_Sets-and-Maps`

fun main() {
//  --- SETS ---

//  Contains only unique items (immutable)
  val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Mango", "Orange")

  println(fruits) // [Orange, Apple, Grape, Mango]

//  Get size of set
  println(fruits.size) // 4

// Sort
  println(fruits.toSortedSet()) // [Apple, Grape, Mango, Orange]

//  mutable set
  val newFruits = fruits.toMutableList()
  newFruits.add("Water Melon")
  newFruits.add("Pear")
  println(newFruits) // [Orange, Apple, Grape, Mango, Water Melon, Pear]

//  Access particular element
  println(newFruits.elementAt(4)) // Water Melon


//  --- MAPS ---

//  Connect key with value
  val daysOfTheWeeks = mapOf(1 to "Monday", 2 to "Tuesday",  3 to "Wednesday")
//  Get by key
  println(daysOfTheWeeks[2]) //Tuesday

//  Loop through
  for (key in daysOfTheWeeks.keys) {
    print(" $key is to ${daysOfTheWeeks[key]}") //  1 is to Monday 2 is to Tuesday 3 is to Wednesday
  }

//  Map of objects
  val fruitsMap = mapOf(
    "Favourite" to Fruit("Grape", 2.5),
    "OK" to Fruit("Apple", 3.5)
  )

  val newDaysOfWeek = daysOfTheWeeks.toMutableMap()
  newDaysOfWeek[4] = "Thursday"
  newDaysOfWeek[5] = "Friday"

//  Sort
  println(newDaysOfWeek.toSortedMap()) // {1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday}
}

data class Fruit(val name: String, val price: Double)