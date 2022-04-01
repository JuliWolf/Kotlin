package Injections

fun main() {
  val provider = DependencyProvider()

  DecisionMaker(
    provider.provideRepository(),
    provider.provideView()
  ).start()
}

class DependencyProvider {
  fun provideRepository(): IRepository = Repository
  fun provideView(): IView = View
}

class DecisionMaker (
  val repository: IRepository,
  val userInterface: IView
) {
  fun start () {
    userInterface.displayData(repository.getData())
  }
}

interface IRepository {
  fun getData(): String
}

interface IView {
  fun displayData(data: String)
}

object Repository: IRepository {
  override fun getData() = "Real data"
}

object View: IView {
  override fun displayData(data: String) = println(data)
}
