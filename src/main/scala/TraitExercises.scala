object TraitExercises extends App {
  //you can use RandomNums as inspiration
  //TODO generated sequence of 10 random frogs located in 0<=x<=10, 0<=y<=100

  for (i <- 1 to 3) {
    var xInit1 = (scala.util.Random.nextFloat() * 100).round
    var yInit1 = (scala.util.Random.nextFloat() * 100).round

    var xInit2 = (scala.util.Random.nextFloat() * 100).round
    var yInit2 = (scala.util.Random.nextFloat() * 100).round

    if (xInit2 > xInit1) {
      val xPt1 = xInit1
      val xPt2 = xInit2
    } else {
      val xPt1 = xInit2
      val xPt2 = xInit1
    }
    var
  }


  //TODO generate 10 random rectangles with topLeft again from 0 to 100 both coordinates

  //val frogs: Seq[Frog]
  //TODO and bottom right coordinates being also from 0 to 100
  //TODO of course bottom right should be to the right and to the bottom of topLeft
  //val gardens: Seq[Rectangle]
  //TODO create method that checks if frog is in the rectangle

  //val checkFrogs = {
  //TODO for now just print which frogs live inside which gardens
  //}
  //
}
