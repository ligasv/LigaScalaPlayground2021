import scala.io.Source
import java.io.{PrintWriter, File}

object CookbookFilter extends App{

  def getLinesFromFile(srcPath: String) = {
    val bufferedSource = Source.fromFile(srcPath)
    val lines = bufferedSource.getLines.toArray
    bufferedSource.close
    lines
  }

  val relative_path = "src/resources/cookbook.txt"
  val cookbook_lines = getLinesFromFile(relative_path)

  val maxIndex = cookbook_lines.length-1
  //val maxIndex = 10

  val mutLinesMap = collection.mutable.Map.empty[Int,String]
  for (key <- 0 to maxIndex) mutLinesMap(key) = cookbook_lines(key)
  val allLinesMap = mutLinesMap.toMap

  def onlyCaps(line: String) = if ((line.toUpperCase == line) && (line.length > 0)) true else false

  val capsMap = allLinesMap.filter((key) => onlyCaps(key._2))

  //val indentMap = allLinesMap.filter((key) =>)

  val allLinesFiltered = for (line <- 0 to maxIndex) yield capsMap.get(line) match {
    case Some(line) => line
    case None => None
  }

  val outputArray= allLinesFiltered.filter(_ != None)
  val combinedString = outputArray.mkString("\n")

  val relative_save_path = "src/resources/cookbook_extract.txt"
  val outputFile= new PrintWriter(new File(relative_save_path ))
  outputFile.write(combinedString)
  outputFile.close()

}
