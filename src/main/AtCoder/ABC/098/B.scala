object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val str = inputs(1)

  println(solve(str))

  private def solve(str: String): Int = {
    val size   = str.size

    var result = 0

    (1 until size).foreach { i =>
      val part = str.splitAt(i)
      val left = part._1.toSet
      val right = part._2.toSet

      val count = left.filter(right.contains(_)).size
      if (result < count) {
        result = count
      }
    }
    result
  }
}
