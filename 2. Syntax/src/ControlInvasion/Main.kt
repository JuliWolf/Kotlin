package ControlInvasion

fun main() {
  val provider = DependencyProvider()

  val result: ResultWrapper = GetUser()
    .execute(
      ServiceLocator(
        provider.provideLocalRepo(),
        provider.provideRemoteRepo()
      ),
      "123456789"
    )

  println(result.toString())
}

class GetUser {
  fun execute(locator: ServiceLocator, id: String): ResultWrapper {
    val remoteResult = locator.remote.getUser(id)

    if (remoteResult is ResultWrapper.Success) {
      return remoteResult
    }

    return locator.local.getUser(id)
  }
}

class ServiceLocator (
  val local: IRepository,
  val remote: IRepository
)



//Starter
class DependencyProvider{
  fun provideLocalRepo(): IRepository = LocalRepositoryImpl
  fun provideRemoteRepo(): IRepository = RemoteRepositoryImpl
}

data class User(
  val id: String,
  val name: String,
  val avatarUrl: String
)

sealed class ResultWrapper {
  data class Success(val user: User) : ResultWrapper()
  data class Exception(val message: String) : ResultWrapper()
}

interface IRepository {
  fun getUser(id: String): ResultWrapper
}

object LocalRepositoryImpl : IRepository {
  override fun getUser(id: String): ResultWrapper = ResultWrapper.Success(
    User(
      "1234567890",
      "Marcus Aurelius",
      "https://en.wikipedia.org/wiki/Marcus_Aurelius"
    )
  )
}

object RemoteRepositoryImpl : IRepository {
  override fun getUser(id: String): ResultWrapper = ResultWrapper.Exception(
    "No Network Connection"
  )
}