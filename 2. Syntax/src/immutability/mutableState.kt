package immutability

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
  val b = Blin(0)

//launch introduces concurrency
  val c1 = launch {
    printCurrentValue(b)
  }

  val c2 = launch {
    b.a = 1
  }

  c1.join()
  c2.join()
}

class Blin(var a: Int)

suspend fun printCurrentValue(b: Blin) {
  doThing(b.a)
  delay(1000L)
  doThing(b.a)
}

fun doThing (x: Int) {
  println("I was callse with $x")
}