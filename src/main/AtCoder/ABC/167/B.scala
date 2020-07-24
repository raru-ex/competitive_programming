object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs(0).split(" ").map(_.toInt)
  val a = nums(0)
  val b = nums(1)
  val c = nums(2)
  val k = nums(3)

  println(solve(a, b, c, k))

  def solve(a: Int, b: Int, c: Int, k: Int): Int = {
    var ans = 0

    if(k < a) {
      ans = k
    } else if (k <= a + b) {
      ans = a
    } else {
      val tmpK = k - (a + b)
      ans = a + (tmpK * -1)
    }
    return ans
  }
}
