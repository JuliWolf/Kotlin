fun main() {
  val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)
//    list
//        .filterNotNull()
//        .filter{
//            it.startsWith("J")
//        }
//        .map{
//            it.length
//        }
//        .forEach {
//            println(it)
//        }

//    list
//        .filterNotNull()
//
////      --- take first 3 items
////        .take(3)
//
////      --- take last 3 items
//        .takeLast(3)
//        .forEach {
//            println(it)
//        }

//  list
//    .filterNotNull()
////   --- map values into key and value
//    .associate {
//      it to it.length
//    }
//    .forEach {
//        println("${it.value}, ${it.key}")
//    }

  val map = list
    .filterNotNull()
    .associate {
      it to it.length
    }

  val language = list.first()
  println(language) // Kotlin

  val lastLanguage = list.last()
  println(lastLanguage) // null

  val lastNotNullLanguage = list.filterNotNull().last()
  println(lastNotNullLanguage) // Javascript

  val firstFoundLanguage = list.filterNotNull().find{it.startsWith("Java")}
  println(firstFoundLanguage) // Java

  val lastFoundLanguage = list.filterNotNull().findLast{it.startsWith("Java")}
  println(lastFoundLanguage) // Javascript

  val foundNotExistingLanguage = list.filterNotNull().findLast{it.startsWith("foo")}.orEmpty()
  println(foundNotExistingLanguage) // null orEmpty ""

}