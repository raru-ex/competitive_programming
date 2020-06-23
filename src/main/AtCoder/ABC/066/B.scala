object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val oddStr = inputs.head

  println(solve(oddStr))

  private def solve(oddStr: String): Int = {
    val size   = oddStr.size

    Range.inclusive(2, size, 2) .foreach { i =>
      val str = oddStr.dropRight(i)
      val part = str.splitAt(str.size / 2)
      if(part._1 == part._2) {
        return size - i
      }
    }

    -1
  }
}
