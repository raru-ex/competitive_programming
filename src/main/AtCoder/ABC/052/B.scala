object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs: Seq[String] = Seq("5", "IIDID")
  val n = inputs(0).toInt
  val s = inputs(1)

  println(solve(n, s))

  private def solve(n: Int, s: String): Int = {
    val seq = scala.collection.mutable.ArrayBuffer.fill(n+1)(0)
    (1 to n).foreach { i =>
      s(i-1) match {
        case 'I' =>
          seq.update(i, seq(i-1) + 1)
        case 'D' =>
          seq.update(i, seq(i-1) - 1)
        case _   => ()
      }
    }
    seq.max
  }

}
