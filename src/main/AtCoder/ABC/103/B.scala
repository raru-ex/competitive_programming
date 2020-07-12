object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val s = inputs(0)
  val t = inputs(1)

  println(solve(s, t))

  def solve(s: String, t: String): String = {
    val size = s.size
    var ans = "No"
    (0 until size).foreach { i =>
      val splited = s.splitAt(size - i)
      if ( (splited._2 + splited._1) == t) {
        ans = "Yes"
      }
    }

    ans
  }
}
