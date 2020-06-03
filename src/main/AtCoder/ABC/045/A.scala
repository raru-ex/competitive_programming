// package ABC044

// n!の計算
object A extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("3","4","2")
  val a = inputs(0).toInt
  val b = inputs(1).toInt
  val h = inputs(2).toInt

  println(solve(a, b, h))

  def solve(a: Int, b: Int, h: Int): Int = {
    (a + b) * h / 2
  }
}
