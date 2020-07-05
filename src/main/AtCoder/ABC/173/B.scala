object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs(0).toInt
  val lines = inputs.tail

  solve(lines)

  def solve(lines: Seq[String]): Unit = {
    val resultMap = scala.collection.mutable.HashMap(("WA", 0), ("TLE", 0), ("AC", 0), ("RE", 0))
    lines.foreach { v =>
      resultMap.update(v, resultMap(v) + 1)
    }

    println(s"AC x ${resultMap("AC")}")
    println(s"WA x ${resultMap("WA")}")
    println(s"TLE x ${resultMap("TLE")}")
    println(s"RE x ${resultMap("RE")}")
  }
}
