object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nq = inputs(0).split(" ").map(_.toInt)
  val n = nq(0)
  val q = nq(1)
  val t1 = inputs.tail
  val colors = t1.head.split(" ").map(_.toInt)
  val t2 = t1.tail


  solve(n, q, colors, t2)

  // TLE
  def solve(n: Int, q: Int, colors: Array[Int], ranges: Seq[String]): Unit = {
    ranges.foreach { str =>
      val range = str.split(" ").map(_.toInt)
      val start = range(0) - 1
      val end  = range(1) - 1
      val set = scala.collection.mutable.Set.empty[Int]
      (start to end).foreach { i =>
        set.add(colors(i))
      }
      println(set.size)
    }
  }
}
