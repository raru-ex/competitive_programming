// package ABC046

object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("10 8")
  val nums = inputs.head.split(" ").map(_.toInt)
  val n = nums(0)
  val k = nums(1)

  println(solve(n, k))

  def solve(n: Int, k: Int): Int = {
    (1 until n).foldLeft(k){ (acc, _) => acc * (k - 1) }
  }
}
