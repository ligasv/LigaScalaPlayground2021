object ligaSequence extends App {

  val mySeq = Seq(1,2,4,5)
  println(mySeq)
  val mappedSeq = mySeq.map(_ * 100)
  println(mappedSeq)
  val filteredSeq = mySeq.filter(ASDF => ASDF > 3)
  println(s"filtered Seq $filteredSeq")
  println(mySeq.drop(1))
  val bigSeq = (1 to 10).toVector
  println(s"bigSeq = $bigSeq")
  println(bigSeq.slice(3,6))
  println(bigSeq.length)
  val by1000 = bigSeq.map(_*1000)
  println(by1000)
  println(by1000.last)


}