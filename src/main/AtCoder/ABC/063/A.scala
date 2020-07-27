object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val a = nums(0)
  val b = nums(1)

  println(solve(a, b))

  private def solve(a: Int, b: Int): String = {
    (a + b) match {
      case v if 10 <= v => "error"
      case v => v.toString
    }
  }
}
