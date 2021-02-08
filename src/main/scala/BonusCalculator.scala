import scala.io.StdIn.readLine

object BonusCalculator extends App {
  //TODO Calculate yearly Xmas Bonus
  //Ask for Employee Name
  val employee = readLine("What is your name?")
  println(s"Nice to talk to you $employee!")

  //Ask for how long they have worked
  //ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus
  val years= readLine("Have many years have you worked here?").toFloat
  val wage = readLine("What is your monthly wage?").toFloat
  val bonus = (years -2) * 0.15 * wage
  if (years <2) println(" have a nice Xmas")
    else println(s"your bonus this year is $bonus")
}
    // (years - 2) *0,15 *wage

