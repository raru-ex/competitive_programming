object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val lrd    = inputs(0).split(" ").map(_.toInt)
  val l = lrd(0)
  val r = lrd(1)
  val d = lrd(2)

  println(solve(l, r, d))

  def solve(l: Int, r: Int, d: Int): Int = {
    var ans = 0
    (l to r).foreach { i =>
      if (i % d == 0) {
        ans = ans  + 1
      }
    }
    ans
  }
}
