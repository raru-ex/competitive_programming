// TLEしてしまう。
object Main extends App {
  val inputs: IndexedSeq[String] = scala.io.Source.stdin.getLines().toIndexedSeq
  // val inputs = IndexedSeq("5", "5 5 5 5 10")
  // val inputs = Seq("10", "33 18 45 28 8 19 89 86 2 4")

  val n = inputs(0).toInt
  val nums = inputs(1).split(" ").map(_.toInt)

  println(solve(n, nums))

  def solve(n: Int, nums: IndexedSeq[Int]): Int = {
    val sortedNums = nums.sorted
    var divSeq = sortedNums
    val results = scala.collection.mutable.IndexedSeq.fill(n)(true)

    (0 until n).foreach { i =>
      // 約分されたものはスキップ
      if(results(i)) {
        // 分母
        val div = divSeq(i)

        (i + 1 until n).foreach { j =>
          // 約分されたものはスキップ
          if(results(j)) {
            // 割り切れる人たち
            if (sortedNums(j) % div == 0) {
              results.update(j, false)
            }

            // 同じ数値を持つものは消す.
            if (sortedNums(i) == sortedNums(j)) {
              results.update(i, false)
            }
          }
        }
      }
    }

    var result = 0
    results.foreach { v =>
      if (v) {
        result = result + 1
      }
    }

    return result
  }
}
