object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toInt

  println(solve(n))

  def solve(n: Int): Long = {
    val nums = scala.collection.mutable.ArrayBuffer.fill(0)(n+1)
    var ans = 0L

    (1 to n).foreach { i =>
      ans = ans + i * sumAll(n/i)
    }

    return ans
  }

  private def sumAll(n: Int): Long = {
    (n * (n + 1L)) / 2
  }
}
