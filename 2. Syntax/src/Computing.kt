// Computation function better to be "Pure"

// might return Integer or null
fun safeConvertStringToInt (s: String): Int? {
  return when (s) {
    "0" -> 0
    "1" -> 1
    "2" -> 2
    "3" -> 3
    "4" -> 4
    "5" -> 5
    "6" -> 6
    "7" -> 7
    "8" -> 8
    "9" -> 9
    else -> null
  }
}

fun main() {
//  Bad
  println(safeConvertStringToInt("Potato"))
//  Good
  println("1".toIntOrNull())
}