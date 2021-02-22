object UsingClassesLiga extends App{
  val myHouse = new HouseLiga() //creating new objects from regular classes
  println(myHouse) // just shows memory adress
  println(myHouse.age,myHouse.isForSale,myHouse.color)
  val a = myHouse.showSecret()
}
