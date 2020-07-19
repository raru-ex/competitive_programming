object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val a    = inputs(0).toInt
  val b    = inputs(1).toInt
  val c    = inputs(2).toInt
  val x    = inputs(3).toInt

  println(solve(a, b, c, x))

  def solve(a: Int, b: Int, c: Int, x: Int): Int = {
    var ans = 0
    (0 to a).foreach { i =>
      (0 to b).foreach { j =>
        (0 to c).foreach { k =>
          val price = 500 * i + 100 * j + 50 * k
          if (x == price) {
            ans = ans + 1
          }
        }
      }
    }

    ans
  }
}
