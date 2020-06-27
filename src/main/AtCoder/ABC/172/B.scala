object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val s = inputs(0)
  val t = inputs(1)

  println(solve(s, t))

  def solve(s: String, t: String): Int = {
    val size  = s.size
    var count = 0
    (0 until size).foreach { i =>
      if(s(i) != t(i)) {
        count = count + 1
      }
    }
    return count
  }
}
