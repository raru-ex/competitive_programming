object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val abc = inputs.head.split(" ").map(_.toInt)
  val a = abc(0)
  val b = abc(1)
  val c = abc(2)

  println(solve(a, b, c))

  private def solve(a: Int, b: Int, c: Int): String = {
    if(b - a == c - b) {
      return "YES"
    } else {
      return "NO"
    }
  }
}
