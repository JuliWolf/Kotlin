package `6_Break-and-Continue`

fun main() {
  for (i in 1 until 20) {
    print("$i ")
    if (i / 2 == 5) {
      break
    }
  }

  println("\n")
  for (i in 1 until 20) {
    if (i / 2 == 5) {
      continue
    }

    print("$i ")
  }
  
  println("Done with the loop")
}