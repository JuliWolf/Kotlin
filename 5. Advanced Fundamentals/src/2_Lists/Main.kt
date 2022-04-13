package `2_Lists`

fun main() {
//  List are immutable
  val months = listOf("January","February", "March")
  val anyTypes = listOf(1,2,3, true, false, "String")

//  Get size of list
  println(anyTypes.size) // 6

//  Get item by index
  println(months[1]) // February

//  arrray through
  for (month in months) {
    print(" $month") // January FebruaryMarch
  }

//  Convert into mutable list
  val additionalMonths = months.toMutableList()
  val newMonths = arrayOf("April","May", "June")

//  Add one item
  additionalMonths.add("July")

//  Add multiple items
  additionalMonths.addAll(newMonths)
  println(additionalMonths) // [January, February, March, July, April, May, June]

//  Create mutable list of type
  val days = mutableListOf<String>("Mon", "Tue", "Wed")
  days.add("Thu")
  println(days) // [Mon, Tue, Wed, Thu]

//  Overwrite
  days[2]= "Sunday"

//  Remove by index
  days.removeAt(3)

  println(days) // [Mon, Tue, Sunday]

//  Remove particular items
  val removeList = mutableListOf<String>("Mon", "Wed")
  days.removeAll(removeList)
  println(days) // [Tue, Sunday]

//  Remove all
  days.removeAll(days)
  println(days) // []

}