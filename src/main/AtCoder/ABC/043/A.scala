// package ABC043

// n!の計算
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("5")
  val num = inputs.head.toInt

  println(solve(num))

  def solve(num: Int): Int = {
    (0 to num).foldLeft(0){ (acc, i) => acc + i }
  }
}
