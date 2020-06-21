// TLE
object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val size = inputs(0).toInt
  val startNums = inputs(1).split(" ").map(_.toInt)
  val q = inputs(2).toInt
  val bi = inputs.splitAt(3)._2

  solve(size, startNums, q, bi)

  def solve(size: Int, startNums: Seq[Int], q: Int, bi: Seq[String]): Unit = {
    val array = scala.collection.mutable.ArrayBuffer.empty[Int]
    startNums.foreach { v =>
      array.append(v)
    }

    // 最終的に数字が何になるのかだけ処理する
    bi.foreach { str =>
      val set = str.split(" ").map(_.toInt)
      val from = set(0)
      val to = set(1)
      (0 until size).foreach { i =>
        if(from == array(i)) {
          array.update(i, to)
        }
      }
      println(array.sum)
    }
  }
}
