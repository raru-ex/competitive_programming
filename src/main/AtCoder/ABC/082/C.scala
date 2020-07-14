object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n    = inputs(0).toInt
  val nums = inputs(1).split(" ").map(_.toInt)

  println(solve(n, nums))

  def solve(n: Int, nums: Array[Int]): Int = {
    val countMap = scala.collection.mutable.HashMap.empty[Int, Int]

    nums.foreach { num =>
      countMap.update(num, countMap.applyOrElse(num, (v: Int) => 0) + 1)
    }

    var ans = 0
    countMap.foreach { case (k, v) =>
      if (k != v) {
        if (k < v) {
          // println(s"k = $k, v = $v: ${k - v}")
          ans = ans + Math.abs(k - v)
        } else {
          // println(s"k = $k, v = $v: $v")
          ans = ans + v
        }
      }
    }

    ans
  }
}
