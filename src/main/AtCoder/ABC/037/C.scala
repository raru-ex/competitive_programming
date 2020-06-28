object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nk = inputs(0).split(" ").map(_.toInt)
  val n  = nk(0)
  val k  = nk(1)
  val nums = inputs(1).split(" ").map(_.toLong)

  println(solve(n, k, nums))

  def solve(n: Int, k: Int, nums: Seq[Long]): Long = {

    if(n <= k) {
      return nums.sum
    } else {
      val numsPart = nums.splitAt(k)
      val firstSum = numsPart._1.sum
      var currentSum = firstSum
      var result     = firstSum

      // 毎回sumすると重いので差分だけ計算
      (1 until n - k + 1).foreach { i =>
        currentSum = currentSum - nums(i - 1) + nums(i + k -1)
        result = result + currentSum
      }
      return result
    }
  }
}
