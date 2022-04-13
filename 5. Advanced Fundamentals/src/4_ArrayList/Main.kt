package `4_ArrayList`

fun main() {
//  ArrayList are used to create a dynamic array.
//  Which means the size of an ArrayList can be increased or decreased according to your requirement

//  The ArrayList class provides both read and write functionality

//  The ArrayList follows the sequence of insertion order

//  An ArrayList  is non synchronized and it may contain duplicate elements

  val arrayList = ArrayList<String>()
  arrayList.add("One")
  arrayList.add("Two")

  println("print ArrayList")
  for (i in arrayList) {
    println(i) // One Two
  }

//  Fill array using collections
  var list: MutableList<String> = mutableListOf<String>()

  list.add("One")
  list.add("Two")

  arrayList.addAll(list)

  val itr = arrayList.iterator()

  while  (itr.hasNext()) {
    println(itr.next()) // One Two
  }

  println("Size of arrayList = ${arrayList.size}") // Size of arrayList = 2

//  Get element by index
  println(arrayList.get(1)) // Two
  println(arrayList[1]) // Two
}