object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ")
  val a = nums(0)
  val b = nums(1)
  val c = nums(2)

  println(solve(a, b, c))

  private def solve(a: String, b: String, c: String): String = {
    if (a(a.size - 1) == b(0) && b(b.size - 1) == c(0)) {
      "YES"
    } else {
      "NO"
    }
  }
}
