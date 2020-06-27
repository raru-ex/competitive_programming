object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toInt

  println(solve(n))

  def solve(n: Int): Long = {
    var ans = 0L

    (1 to n).foreach { i =>
      (i to n by i).foreach { j =>
        ans = ans + j
      }
    }

    return ans
  }
}

