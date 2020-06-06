// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("56 25 31")
  val vars = inputs.head.split(" ")
  val a = vars(0).toLong
  val b = vars(2).toLong
  val op = vars(1)

  val result = op match {
    case "+" => a + b
    case _   => a - b
  }

  println(result)
}
