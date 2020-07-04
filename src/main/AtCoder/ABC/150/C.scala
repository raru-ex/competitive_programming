object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs(0).toInt
  val p = inputs(1).split(" ").mkString("").toInt
  val q = inputs(2).split(" ").mkString("").toInt

  println(solve(n, p, q))

  def solve(n: Int, p: Int, q: Int): Int = {
    val comb = (1 to n).permutations.map(_.mkString("")).map(_.toInt).toSeq
    return Math.abs(comb.indexOf(p) - comb.indexOf(q))
  }
}
