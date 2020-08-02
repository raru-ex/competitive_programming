object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val air = inputs.head.toInt

  println(solve(air))

  def solve(a: Int): String = {
    if(30 <= air) {
      "Yes"
    } else {
      "No"
    }
  }
}
