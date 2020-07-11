object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n    = inputs(0).toInt
  val nums    = inputs(1).split(" ").map(_.toInt)

  println(solve(n, nums))

  def solve(n: Int, nums: Seq[Int]): Int = {
    var ans = 0
    (1 to n).foreach { i =>
      val index = i - 1
      if (i % 2 == 1 && nums(index) % 2 ==1) {
        ans = ans + 1
      }
    }
    ans
  }
}
