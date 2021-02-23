
class Frog extends Philosophical with HasLegs{
  override def toString: _root_.java.lang.String =

}

trait HasLegs{
  var legCount = 4
  def jump (hawFar : Double= s"Print jumps on all $legCount leg meter far"