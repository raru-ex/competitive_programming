// CE
object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nk  = inputs.head.split(" ").map(_.toInt)
  val n   = nk(0)
  val k   = nk(1)
  val nums = inputs(1).split(" ").map(_.toLong)

  println(solve(n, k, nums))

  def solve(n: Int, k: Int, nums: Seq[Long]): Long = {
    val sortedNums = nums.sorted
    var minusIndex = 0
    var minusMulti = 0L
    var totalMulti = 1L
    val lastIndex  = n - 1
    var times = 0L
    val amari = 1000000007L

    while(times < k) {
      if(n > 1) {
        val min1 = sortedNums(minusIndex)
        val min2 = sortedNums(minusIndex + 1)

        if (min1 < 0 && min2 < 0) {
          // cast
          minusMulti = min1 * min2
        }
      }

      if(n - times >= 2 && minusMulti > sortedNums(lastIndex - times) * sortedNums(lastIndex - times - 1)) {
        totalMulti = (totalMulti * (minusMulti / amari)) / amari
        times = times + 2
      } else {
        totalMulti = (totalMulti * sortedNums(lastIndex - times)) / amari
        times = times + 1
      }
    }

    if(totalMulti < 0) {
      amari - Math.abs(totalMulti)
    } else {
      totalMulti
    }
  }
}
