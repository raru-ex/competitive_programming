object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val a = nums(0)
  val b = nums(1)
  val c = nums(2)

  println(solve(a, b, c))

  def solve(a: Int, b: Int, c: Int): String = {
    val num = a * 100 + 10 * b + c

    if (num % 4 == 0) {
      "YES"
    } else {
      "NO"
    }
  }
}
