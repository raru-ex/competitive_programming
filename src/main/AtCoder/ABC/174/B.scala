object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nd = inputs(0).split(" ").map(_.toInt)
  val n = nd(0)
  val d = nd(1)
  val tail = inputs.tail

  println(solve(n, d, tail))

  def solve(n: Int, d: Int, tail: Seq[String]): Int = {
    var count = 0
    tail.foreach { line =>
      val xy = line.split(" ").map(_.toInt)
      val base = Math.sqrt( Math.pow(xy(0).toDouble, 2D) + Math.pow(xy(1).toDouble, 2D))
      if(base <= d.toDouble) {
        count = count + 1
      }
    }

    count
  }
}
