object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val x = inputs(0).toInt

  println(solve(x))

  def solve(x: Int): Int = {
    if (x < 600) {
      8
    } else if (600 <= x && x < 800) {
      7
    } else if (800 <= x && x < 1000) {
      6
    } else if (1000 <= x && x < 1200) {
      5
    } else if (1200 <= x && x < 1400) {
      4
    } else if (1400 <= x && x < 1600) {
      3
    } else if (1600 <= x && x < 1800) {
      2
    } else if (1800 <= x) {
      1
    } else {
      -1
    }
  }
}
