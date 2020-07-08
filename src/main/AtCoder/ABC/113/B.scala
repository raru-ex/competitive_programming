object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n    = inputs(0).toInt
  val ta   = inputs(1).split(" ").map(_.toInt)
  val t    = ta(0)
  val a    = ta(1)
  val hSeq = inputs(2).split(" ").map(_.toInt)

  println(solve(n, t, a, hSeq))

  def solve(n: Int, t: Int, a: Int, hSeq: Seq[Int]): Int = {
    val c = 0.006D
    val absSeq = hSeq.map { i =>
      val averageC = t - (i * c)
      Math.abs(a - averageC)
    }

    absSeq.indexOf(absSeq.min) + 1
  }
}
