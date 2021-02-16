object LigaMap extends App {

  val m = Map("one" ->1, "two" -> 2, "three" -> 3)
  println(m("two"))  //2
  println(m.contains("wo"))
  //val result = if (m.contains("four")) m("four") else "not found"
  // println(result)
  val getResult = m.get("three")
  println(getResult)

  println(m.get("three"))

  //println(m.get("three").getOrElse("None type inside"))
  //println(m.get("not existing").getOrElse("None type inside"))
  //val immutabaleMap = Map(mutMap).toMap
  //Println(immutabaleMap)



}
