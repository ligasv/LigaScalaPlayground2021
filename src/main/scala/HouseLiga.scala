class HouseLiga {
  //blueprint for creating object instance
  var color = "green"
  var age = 25
  val style = "gothic"
  var isForSale = false
  private val mySecret = "secret"
  println("New House Created")// runs every time new object created
  def prettyPrint() = {
    println(s"$age,$isForSale,$color")
  }
  def showSecret() = {
    println(mySecret)
  }

}
