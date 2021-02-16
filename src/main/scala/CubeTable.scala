import scala.io.StdIn.readLine

object CubeTable extends App {
  //TODO write a program that takes user input for starting and end values
  //then saves cubes of those values in a Seq data type and then prints the cubes out
  val begVal = readLine("What is the starting value?").toInt
  val endVal = readLine("What is the the ending value?").toInt
  println(s"Will print cubes starting with $begVal and ending with $endVal")
  val allVal = Seq.range(begVal,endVal,1)
  val cubeVal = allVal.filter(el => (math.round(math.pow(el,(1.0/3.0))*1000000000.0)/1000000000.0) % 1== 0)
  println(cubeVal)
}
