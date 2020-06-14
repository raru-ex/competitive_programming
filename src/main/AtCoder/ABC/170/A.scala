
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("1 2 0 4 5")
  val nums = inputs.head.split(" ").map(_.toInt)

  println(solve(nums))

  def solve(nums: Seq[Int]): Int = {
    (1 to 5).foreach { i =>
      if (nums(i - 1) == 0) {
        return i
      }
    }
    return -1
  }
}
