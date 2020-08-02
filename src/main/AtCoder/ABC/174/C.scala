object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val k = inputs.head.toInt

  println(solve(k))

  def solve(k: Int): Int = {
    if(k % 2 == 0) {
      -1
    } else {
    }
  }
}
