object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nk   = inputs(0).split(" ").map(_.toInt)
  val n    = nk(0)
  val k    = nk(1)
  val aSeq = inputs(1).split(" ").map(_.toInt)

  solve(n, k, aSeq)

  def solve(n: Int, k: Int, aSeq: Seq[Int]): Unit = {
    (0 until n - k).foreach { i =>
      if(aSeq(i) < aSeq(i + k)) {
        println("Yes")
      } else {
        println("No")
      }
    }

  }
}
