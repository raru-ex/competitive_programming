object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val ab = inputs.head.split(" ")
  val a = ab(0)
  val b = ab(1)

  println(solve(a, b))

  private def solve(a: String, b: String): String = {
    if (a == b) {
      return "H"
    } else {
      return "D"
    }
  }
}
