object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nk = inputs.head.split(" ").map(_.toInt)
  val n = nk(0)
  val k = nk(1)
  val fruits = inputs(1).split(" ").map(_.toInt)

  println(solve(n, k, fruits))

  def solve(n: Int, k: Int, fruits: Seq[Int]): Int = {
    val sortedFruits = fruits.sorted
    (0 until k).foldLeft(0)((sum, index) => sum + sortedFruits(index))
  }
}
