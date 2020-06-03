// package ABC044

// n!の計算
object A extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("5","3","10000","9000")
  val N = inputs(0).toInt
  val K = inputs(1).toInt
  val X = inputs(2).toInt
  val Y = inputs(3).toInt

  println(solve(N, K, X, Y))

  def solve(n: Int, k: Int, x: Int, y: Int): Int = {
    val a = (n - k)
    if (a <= 0) {
      n * x
    } else {
      (k * x) + (n - k) * y
    }
  }
}
