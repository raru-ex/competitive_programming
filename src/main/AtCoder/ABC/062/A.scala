object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val x = nums(0)
  val y = nums(1)

  println(solve(x, y))

  private def solve(x: Int, y: Int): String = {
    val ga = Seq(1, 3, 5, 7, 8, 10, 12)
    val gb = Seq(4, 6, 9, 11)
    val yes = (ga.contains(x) && ga.contains(y)) || (gb.contains(x) && gb.contains(y))

    if (x == 2 || y == 2) {
      "No"
    } else if (yes) {
      "Yes"
    } else {
      "No"
    }
  }
}
