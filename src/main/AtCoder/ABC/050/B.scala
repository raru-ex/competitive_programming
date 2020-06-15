object Main extends App {
  // val inputs: IndexedSeq[String] = scala.io.Source.stdin.getLines().toIndexedSeq
  val inputs = IndexedSeq("5", "7 2 3 8 5", "3", "4 2", "1 7", "4 13")
  val n = inputs(0).toInt
  val tSeq = inputs(1).split(" ").map(_.toInt)
  val m = inputs(2).toInt
  val pms = inputs.takeRight(m)

  println(solve(n, tSeq, m, pms))

  private def solve(n: Int, times: IndexedSeq[Int], m: Int, drinks: IndexedSeq[String]): String = {
    val sum = times.sum
    val resultSeq = scala.collection.mutable.ArrayBuffer.empty[Int]

    (0 until m).foreach { i =>
      val pair = drinks(i).split(" ").map(_.toInt)
      val timeIndex = pair(0) - 1
      val mTime = pair(1)

      val dis = mTime - times(timeIndex)
      resultSeq.append(scala.math.max(0, sum + dis))
    }

    resultSeq.mkString("\n")
  }
}
