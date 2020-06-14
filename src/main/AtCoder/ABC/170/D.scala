// 解けなかった
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("10", "33 18 45 28 8 19 89 86 2 4")

  val n = inputs(0).toInt
  val nums = inputs(1).split(" ").map(_.toInt)
  // val inputs = Seq("100 0", "")
  println(solve(n, nums))

  def solve(n: Int, nums: Seq[Int]): Int = {
    val sortedNums = nums.sorted
    var resultSet = sortedNums
    resultSet ++= sortedNums

    (0 until n).foreach { i =>
      resultSet = resultSet.filter(v => v % sortedNums(i) != 0)
      println(resultSet)
    }

    resultSet.size + 1
  }
}
