object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("2 2")
  val nums = inputs.head.split(" ").map(_.toInt)

  println(solve(nums(0), nums(1)))

  private def solve(k: Int, s: Int): Int = {
    val max = 3 * k
    if (s == 0 || s == max) {
      return 1
    }

    var ans = 0
    (0 to k).foreach { i =>
      (0 to k).foreach { j =>
        val sum = i + j
        val dis = s - sum
        if (dis <= k && 0 <= dis) {
          ans = ans + 1
        }
      }
    }

    ans
  }
}
