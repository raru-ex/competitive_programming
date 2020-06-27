object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs(0).toInt

  println(solve(n))

  def solve(n: Int) = {
    (n + Math.pow(n, 2) + Math.pow(n, 3)).toInt
  }
}
