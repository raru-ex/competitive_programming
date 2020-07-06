object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n    = inputs.head.toInt
  val nums = inputs(1).split(" ").map(_.toInt)

  println(solve(n, nums))

  def solve(n: Int, nums: Seq[Int]): Long = {
    // 5 8 1 9 3 2 7
    // 0 -> 9 -> 8 -> 8 -> 7 -> 7 ->
    var comfort = 0L
    var currentMinNum  = 0
    val sortedNums = nums.sorted
    val lastIndex  = n - 1
    var times = 1

    Range.inclusive(lastIndex, 0, -1).foreach { i =>
      comfort = comfort + currentMinNum
      currentMinNum = sortedNums(lastIndex - (times/2))
      times = times + 1
    }
    comfort
  }
}
