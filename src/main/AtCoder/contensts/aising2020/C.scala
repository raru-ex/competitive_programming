object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n    = inputs(0).toInt

  solve(n)

  def solve(n: Int): Unit = {
    var nMap = scala.collection.mutable.HashMap.empty[Long, Int]

    (1L to 100L).foreach { i =>
      (1L to 100L).foreach { j =>
        (1L to 100L).foreach { k =>
          val f = i*i + j*j + k*k + i*j + j*k + k*i
          nMap.update(f, nMap.applyOrElse(f, (k: Long) => 0) + 1)
        }
      }
    }
    (1 to n).foreach { i =>
      println(nMap.applyOrElse(i.toLong, (k: Long) => 0))
    }
  }
}
