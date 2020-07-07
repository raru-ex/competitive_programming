object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs(0).toInt

  println(solve(n))

  def solve(n: Int): Int = {
    n / 2 + n % 2
  }
}
