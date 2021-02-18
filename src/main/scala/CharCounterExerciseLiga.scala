import Maps.mutableMapAgain

import scala.io.StdIn.readLine

object CharCounterExerciseLiga extends App {
  //TODO ask user to enter a sentence
  //TODO calculate and save character frequency into a Map
  //you can use mutable and/or immutable Map
  //print out this map with character frequencies
  //so your Map most likely will be of type [Char,Int]
  //also i think getOrElseUpdate method will be helpful
  val sentence = readLine("type any text")
  val mutCharMap = collection.mutable.Map.empty[Char,Int]
  for (key <- sentence) mutCharMap(key) = mutCharMap.getOrElse(key,0) + 1
  println(mutCharMap)




}
