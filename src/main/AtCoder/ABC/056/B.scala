object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val w = nums(0)
  val a = nums(1)
  val b = nums(2)

  println(solve(w, a, b))

  private def solve(w: Int, a: Int, b: Int): Long = {
    val diff = Math.abs(a - b)
    if (w < diff) {
      return diff - w
    } else {
      0
    }
  }
}
