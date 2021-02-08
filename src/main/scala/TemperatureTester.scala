import scala.io.StdIn.readLine

object TemperatureTester extends App {
  //TODO write a program which asks for user's temperature
  //if Temperature is over 37C print a warming about high temperature
  //if temperature is under 35 print a warning about being cold
  //otherwise print that everything is great :0
  val temp = readLine("What is your temperature").toFloat
  if (temp > 37) println ("your temperature is over 37! see your doctor ")
  else if(temp < 35) println ("your temperature is less than 35! see your doctor ")
  else  println( " you have normal temperature! have a nice day!")

}
