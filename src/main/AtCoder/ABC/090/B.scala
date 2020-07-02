object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val ab = inputs.head.split(" ").map(_.toInt)
  val a  = ab(0)
  val b  = ab(1)

  println(solve(a, b))

  def solve(a: Int, b: Int): Int = {
    var ans = 0
    (a to b).foreach { i =>
      val str = i.toString
      if (str(0) != '0' && str(0) == str(4) && str(1) == str(3)) {
        ans = ans + 1
      }
    }

    ans
  }
}
