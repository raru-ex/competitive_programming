// package ABC046

object A extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("3 4 2")
  val nums = inputs.head.split(" ").map(_.toInt).toSet

  println(nums.size)
}
