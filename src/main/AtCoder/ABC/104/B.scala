object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val s = inputs(0)

  println(solve(s))

  def solve(s: String): String = {
    val cRange = (2 until s.size - 1)
    if(s.filter(_.isUpper).size == 2 && s(0) == 'A' && cRange.filter(s(_) == 'C').size == 1) {
      return "AC"
    }
    return "WA"
  }
}
