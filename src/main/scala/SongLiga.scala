class SongLiga(title:String, author:String, lyrics: Seq[String]) {
  def sing(lyrics: Seq[String],maxLines:Int = -1): Unit = {
    val maxLength = lyrics.length
    if(maxLines == -1) for (line <- 0 to maxLength) println(lyrics(line))
    else for (line <- 0 to maxLength) println(lyrics(line))
  }
  def yell(lyrics: Seq[String]): Unit = {
    for (line <- lyrics) println(line.toUpperCase)
  }



  //TODO create a Song class which is constructed with 3 parameters
  //title
  //author
  //Sequence of lyrics
  //when we create a new object from Song class print the title author and that song is made

  //TODO methods to sing song line by line on the screen

  //TODO method yell (ALL CAPS) the lyrics on the screen

  //bonuss add additional parameter maxLines to above methods, giving it default maybe -1
  //so maxLines if not specified would print all lyrics
  //if specified some positive number would print the number of maxLines
}
