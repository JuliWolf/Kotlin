package AbstractClasses

//class NoteListView: View() {
//
//}
//
//class NoteDetailView: View() {
//
//}
//
//class NoteLoginView: View() {
//
//}

//abstract class View {
//  fun showMessage(message: String) = println(message)
//}


class NoteListView {

}

class NoteDetailView {

}

class NoteLoginView {

}

// Extension function
// <Receiver>.functionName()
fun Any.showMessage(message: String) = println(message)

fun main (args: Array<String>) {
  val list = NoteListView()
  val detail = NoteDetailView()
  val login = NoteLoginView()

  list.showMessage("Open")
  detail.showMessage("For")
  login.showMessage("Login")
}