package DataFlow

fun retrieveData (networkConnected: Boolean): String {
  if (networkConnected == true) {
    return CloudStorage.getRemoteData()
  } else {
    return DeviceStorage.getLocalData()
  }
}

object DeviceStorage {
//  single expression syntax
  fun getLocalData() = ""
}

object CloudStorage {
  //  single expression syntax
  fun getRemoteData() = ""
}