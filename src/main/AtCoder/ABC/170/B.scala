
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("3 10")
  val nums = inputs.head.split(" ").map(_.toInt)
  val animals = nums(0)
  val legs    = nums(1)

  println(solve(animals, legs))

  def solve(animals: Int, legs: Int): String = {
    // 足の数が偶数でない場合No
    if (legs % 2 == 0) {
      // 4で割り切れない奇数は繰り上げ
      val bird = legs / 2
      val kame = scala.math.ceil(legs / 4.asInstanceOf[Double]).toInt

      if ((kame to bird).contains(animals)) {
        return "Yes"
      }
    }

    return "No"
  }
}
