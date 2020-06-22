object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val strings = inputs.head.split(" ")

  println(solve(strings))

  private def solve(strings: Seq[String]): String = {
    strings.map(_.head.toUpper).mkString
  }
}
