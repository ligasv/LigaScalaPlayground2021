class Song(title:String, author:String, lyrics: Seq[String]) {
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

  def sing(maxLines: Int = -1): Unit = {
    val maxLength = lyrics.length
    if (maxLines < 0 | maxLines > maxLength-1)
      for (line <- 0 to maxLength-1) println(lyrics(line))
    else
      for (line <- 0 to maxLines-1) println(lyrics(line))
  }

  def yell(maxLines: Int = -1): Unit = {
    val maxLength = lyrics.length
    if (maxLines < 0 | maxLines > maxLength-1)
      for (line <- 0 to maxLength-1) println(lyrics(line).toUpperCase)
    else
      for (line <- 0 to maxLines-1) println(lyrics(line).toUpperCase)
  }
}