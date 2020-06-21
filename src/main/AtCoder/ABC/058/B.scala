object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val o = inputs(0)
  val e = inputs(1)

  println(solve(o, e))

  private def solve(o: String, e: String): String = {
    val size = e.size
    var result = ""
    (0 until size).foreach { i =>
      result = result + o(i) + e(i)
    }

    if(o.size != e.size) {
      result = result + o(o.size - 1)
    }
    return result
  }
}
