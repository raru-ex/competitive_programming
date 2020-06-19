// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val rate = inputs.head.toInt

  println(if(rate < 1200) { "ABC" } else { "ARC" })
}
