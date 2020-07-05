object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val hwk = inputs.head.split(" ").map(_.toInt)
  val h   = hwk(0)
  val w   = hwk(1)
  val k   = hwk(2)
  val lines = inputs.tail

  println(solve(h, w, k, lines))

  def solve(h: Int, w: Int, k: Int, lines: Seq[String]): Int = {
  }
}
