// 正解
object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val nums   = inputs.head.split(" ").map(_.toInt)

  println(inputs.head.take(3))
}
