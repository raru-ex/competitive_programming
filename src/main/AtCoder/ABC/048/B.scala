// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("11 12 4")
  val nums = inputs.head.split(" ").map(_.toLong)
  val a = nums(0)
  val b = nums(1)
  val x = nums(2)

  println(solve(a, b, x))

  private def solve(a: Long, b: Long, x: Long): Long = {
    val sur = a % x
    val firstDiv = a + (x - sur) % x

    if (b < firstDiv) {
      return 0
    }

    return (b - firstDiv) / x + 1
  }
}
