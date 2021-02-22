object SongExercise extends App {
  //TODO create 2 song objects with authors, title and lyrics
  val Song1 = new Song("Smelly Cat", "Phoebe", Seq("smelly cat, smelly cat", "what are they feeding you"))
  val Song2 = new Song("Bumbuls", "Dievs", Seq("Dievs nosvieda bumbul zemē, bumbul zemē", "bumbuls negrib zemē augt"))

  //TODO call sing and yell methods
  Song1.sing()
  Song1.yell(1)

  Song2.sing(2)
  Song2.yell(20)
}
