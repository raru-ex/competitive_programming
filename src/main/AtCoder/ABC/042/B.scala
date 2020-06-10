// package ABC042

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("3 3", "dxx", "axx", "cxx")
  val input1 = inputs(0).split(" ").map(_.toInt)
  val N = input1(0)
  val L = input1(0)
  val strings = inputs.tail
  val result = strings.sorted.mkString

  println(result)
}
