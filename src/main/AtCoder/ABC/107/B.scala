object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nm    = inputs(0).split(" ").map(_.toInt)
  val n     = nm(0)
  val m     = nm(1)
  val lines = inputs.tail

  solve(n, m, lines)

  def solve(n: Int, m: Int, lines: Seq[String]): Unit = {
    var filtered = lines.filter(_.contains('#'))
    val size     = filtered.size
    var v        = scala.collection.mutable.ArrayBuffer.empty[Int]

    (0 until m).foreach { i =>
      if((0 until size).map { j =>
        filtered(j)(i)
      }.contains('#')) {
        v.append(i)
      }
    }

    filtered.foreach { s =>
      s.zipWithIndex.foreach { case (c, i) =>
        if(v.contains(i)) {
          print(c)
        }
      }
      println()
    }
  }
}
