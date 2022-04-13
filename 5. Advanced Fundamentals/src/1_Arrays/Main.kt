package `1_Arrays`

fun main() {
  val typedNumber: IntArray = intArrayOf(1,2,3,4,5,6)
// Alternative
  val altNumbers = intArrayOf(1,2,3,4,5,6)

  val numbers = arrayOf(1,2,3,4,5,6)

//  Print all array
  println(numbers.contentToString()) // [1, 2, 3, 4, 5, 6]

  for (element in numbers) {
//    print(element) // 123456
    print(" $element+2") // 1+2 2+2 3+2 4+2 5+2 6+2
  }

//  Access particular number
  println(numbers[0]) // 1

//  Modify
  numbers[0] = 6
  numbers[1] = 5
  numbers[4] = 2
  numbers[5] = 1
  println(numbers.contentToString()) // [6, 5, 3, 4, 2, 1]


//  Strings array
  val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
  println(days.contentToString()) // [Sun, Mon, Tues, Wed, Thurs, Fri, Sat]

//  Objects array
  val fruits = arrayOf(
    Fruit("Apple", 2.5),
    Fruit("Grape", 3.5)
  )
  println(fruits.contentToString()) // [Fruit(name=Apple, price=2.5), Fruit(name=Grape, price=3.5)]

  for ( fruit in fruits){
    print(" ${fruit.name}") // Apple Grape
  }

  println()
  for (index in fruits.indices) {
    println("${fruits[index].name} is in index $index") // Apple is in index 0 /n Grape is in index 1
  }

//  Mutliple types
    val mix = arrayOf("Sun", "Mon", "Tues", 1,2,3, Fruit("Apple", 2.5))
  print(mix.contentToString()) // [Sun, Mon, Tues, 1, 2, 3, Fruit(name=Apple, price=2.5)]

}

data class Fruit (val name: String, val price: Double)