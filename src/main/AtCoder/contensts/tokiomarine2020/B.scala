// 正解
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("1000 5", "-50 11", "210")
  // val nums   = inputs.head.split(" ").map(_.toInt)
  val tracker = inputs(0).split(" ").map(_.toInt)
  val a = tracker(0)
  val v = tracker(1)
  val runaway = inputs(1).split(" ").map(_.toInt)
  val b = runaway(0)
  val w = runaway(1)
  val t = inputs(2).toInt

  println(solve(a, v, b, w, t))

  private def solve(a: Int, v: Int, b: Int, w: Int, t: Int): String = {
    val speedDiff = v - w
    val positionDiff = Math.abs(b - a)

    if(0 < speedDiff && (positionDiff / speedDiff.asInstanceOf[Double]) <= t) {
      return "YES"
    } else {
      return "NO"
    }
  }
}
