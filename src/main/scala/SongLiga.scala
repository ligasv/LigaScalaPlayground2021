class SongLiga(title:String, author:String, lyrics: Seq[String]) {

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