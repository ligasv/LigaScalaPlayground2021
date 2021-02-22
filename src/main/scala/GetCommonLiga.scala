
object GetCommonLiga extends App{
  def getCommonElements(s1: Seq[Int], s2: Seq[Int], s3: Seq[Int]): Seq[Int] = {
    //TODO return sorted Sequence of common elements in all 3 sequences
    Seq(0)
  }

  val alphabet = "abcdefghijklmnopqrstuvwxyz"
  val text = "The five boxing wizards jump quickly."
  val alphabetSet = for (i <- alphabet)


  def isPangram(text: String, alphabet : String = "abcdefghijklmnopqrstuvwxyz"): Boolean = {
    //TODO determine if the sentence contains all English letters
    //https://en.wikipedia.org/wiki/Pangram
    // (case is not important here)
    //this function should work on other languages too, if we pass it different alphabet
    val alphabetSet = Set(alphabet)
    //val textSet = Set(text)

    val mutableCharSet = collection.mutable.Set.empty[Char]

    //mutableCharSet = for (letter <- text) Set(letter)

    //if(mutableCharSet = alphabetSet) true {
    //else
    false
    println(alphabetSet)
    //}
  }

  println(isPangram("The five boxing wizards jump quickly.")) //should be true
}
