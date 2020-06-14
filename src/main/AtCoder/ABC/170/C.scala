
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("4 1", "1 4 12")
  // val inputs = Seq("100 0", "")
  val xn = inputs(0).split(" ").map(_.toInt)
  val x = xn(0)
  val n = xn(1)

  if (n == 0) {
    println(x)
  } else {
    val nums = inputs(1).split(" ").map(_.toInt)
    println(solve(x, nums))
  }

  def solve(x: Int, nums: Seq[Int]): Int = {
    val sortedNums = nums.sorted
    (0 to n).foreach { i =>
      if (!nums.contains(x - i)) {
        return x - i
      } else if(!nums.contains(x + i)){
        return x + i
      }
    }
    return -1
  }
}
