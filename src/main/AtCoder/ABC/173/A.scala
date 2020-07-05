object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toInt

  println(solve(n))

  def solve(n: Int): Int = {
    n % 1000 match {
      case 0 => 0
      case v => 1000 - v
    }
  }
}
