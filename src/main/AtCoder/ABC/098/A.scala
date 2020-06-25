object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val ab = inputs.head.split(" ").map(_.toInt)
  val a = ab(0)
  val b = ab(1)

  println(solve(a, b))

  private def solve(a: Int, b: Int): Int = {
    val sum = a + b
    val dis = a - b
    val s = a * b

    Math.max(sum, Math.max(dis, s))
  }
}
