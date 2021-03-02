import scala.io.Source

object Liga1922Poetry extends App {

  val path1922 = "src/resources/poetry_1922.txt"

  def getLinesFromFile(srcPath: String) = {
    val bufferedSource = Source.fromFile(srcPath)
    val lines = bufferedSource.getLines.toArray
    bufferedSource.close
    lines
  }

  val lines = getLinesFromFile(path1922)

  val startLine = 340
  val endLine = 4488

  def removeEmptyLines (lines: Array[String]): Array[String] = {
    //    val subResult = lines.filter(_.length > 1) //for single comparison check
    val authTitleText = lines.filter(line => line.length > 1) //for more complicated checks
    authTitleText
  }

  val noEmptyLines = removeEmptyLines(lines.slice(startLine,endLine))

  noEmptyLines.foreach(println)

  def removeAuthorTitle (lines: Array[String]): Array[String] = {
    val textOnly = lines.filter(line => line.toUpperCase != line)
    textOnly
  }

  val poemTextOnly = removeAuthorTitle(noEmptyLines)

  //poemTextOnly.foreach(println)
}
