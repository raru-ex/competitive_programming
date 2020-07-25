object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val abc = inputs(0).split(" ").map(_.toInt)
  val a   = abc(0) // 赤
  val b   = abc(1) // 緑
  val c   = abc(2) // 青
  val k   = inputs(1).toInt

  println(solve(a, b, c, k))

  // A < B < C
  def solve(a: Int, b: Int, c: Int, k: Int): String = {
    var tmpA = a
    var tmpB = b
    var tmpC = c

    (0 until k).foreach { i =>
      if(tmpA >= tmpB) {
        tmpB = tmpB * 2
      } else if (tmpB >= tmpC) {
        tmpC = tmpC * 2
      }

      if (tmpA < tmpB && tmpB < tmpC) {
        return "Yes"
      }
    }

    if (tmpA < tmpB && tmpB < tmpC) {
      return "Yes"
    } else {
      return "No"
    }

  }
}
