// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("56 25 31")
  val strSeq = inputs.head.split(" ")

  println(s"A${strSeq(1).head}C")
}
