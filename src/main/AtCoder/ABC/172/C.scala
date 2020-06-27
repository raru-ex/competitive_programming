object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val line1  = inputs.head.split(" ").map(_.toInt)
  val aBooks = inputs(1).split(" ").map(_.toInt)
  val bBooks = inputs(2).split(" ").map(_.toInt)

  println(solve(line1(2), aBooks, bBooks))

  def solve(timeLimit: Int, aBooks: Array[Int], bBooks: Array[Int]): Int = {
  }
}
