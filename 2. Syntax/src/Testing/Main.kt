package Testing

import kotlin.test.*
import org.junit.Test

class StringChecker {
  fun checkString(string: String, predicate: Char): Int {
    var occurences = 0
//    string.forEach { character: Char ->
//      if (character == predicate) {
//        occurences++
//      }
//    }

    string.forEach {
      if (it == predicate) occurences++
    }

    return occurences
  }

}

class StringCheckerTest {
  //  "Potato" "Z"
  @Test
  fun `No Occurences` () {
    val testString = "Potato"
    val testChar = 'z'

    // create the real thing
    val checker = StringChecker()

    // record the behaviour
    val result = checker.checkString(testString, testChar)

    // make assertion on that behaviour/state
    assertEquals(result, 0)
  }

  //  "Blin" "i"
  @Test
  fun `One Occurence` () {
    val testString = "Blin"
    val testChar = 'i'

    // create the real thing
    val checker = StringChecker()

    // record the behaviour
    val result = checker.checkString(testString, testChar)

    // make assertion on that behaviour/state
    assertEquals(result, 1)
  }

  //  "Antidisestablishmentarianist" "i"
  @Test
  fun `Many Occurences` () {
    val testString = "Antidisestablishmentarianist"
    val testChar = 'i'

    // create the real thing
    val checker = StringChecker()

    // record the behaviour
    val result = checker.checkString(testString, testChar)

    // make assertion on that behaviour/state
    assertEquals(result, 5)
  }
}

