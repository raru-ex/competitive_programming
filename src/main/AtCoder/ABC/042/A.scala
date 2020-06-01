// package ABC042

// 575に並び替えられるかどうか
object A extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("5 5 7")
  val nums = inputs.head.split(" ").map(_.toInt)

  println(solve(nums))

  def solve(nums: Array[Int]): String = {
    val fiveCount = nums.filter(_ == 5).size
    val sevenCount = nums.filter(_ == 7).size

    if(fiveCount == 2 && sevenCount == 1) {
      "YES"
    } else {
      "NO"
    }
  }
}
