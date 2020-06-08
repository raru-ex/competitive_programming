// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val a = nums(0) * nums(1)
  val b = nums(2) * nums(3)

  println(if(a < b) { b } else { a })
}
