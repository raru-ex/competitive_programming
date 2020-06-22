object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val a = nums(0)
  val b = nums(1)
  val c = nums(2)

  println(solve(a, b, c))

  private def solve(a: Int, b: Int, c: Int): String = {
    (1 to b).foreach { i =>
      if(a * i % b == c) {
        return "YES"
      }
    }
    "NO"
  }
}
