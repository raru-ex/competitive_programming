object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val dishes = inputs.head.toInt
  val x = 800 * dishes
  val y = 200 * (dishes / 15)

  println(x - y)
}
