// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("56 25 31")
  val nums = inputs.head.split(" ").map(_.toInt)
  val sum = Math.abs(nums(0) + nums(1))
  val dis = Math.abs(nums(0) - nums(1))

  println(if (sum == nums(2) || dis == nums(2)) { "Yes" } else { "No" })
}
