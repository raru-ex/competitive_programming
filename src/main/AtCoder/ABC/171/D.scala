object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val size = inputs(0).toInt
  val startNums = inputs(1).split(" ").map(_.toInt)
  val q = inputs(2).toInt
  val bi = inputs.splitAt(3)._2

  solve(size, startNums, q, bi)

  def solve(size: Int, startNums: Seq[Int], q: Int, bi: Seq[String]): Unit = {
    val array = scala.collection.mutable.HashMap.empty[Int, Int]
    // Longにしないとオーバーフローする
    var sum = 0L
    startNums.foreach { v =>
      sum = sum + v
      array.update(v, array.applyOrElse(v, (n: Int) => 0) + 1)
    }

    // 最終的に数字が何になるのかだけ処理する
    bi.foreach { str =>
      val set = str.split(" ").map(_.toInt)
      val from = set(0)
      val to   = set(1)
      var diff = 0L

      if(array.isDefinedAt(from)) {
        diff = (to - from) * array(from)
        array.update(to, array.applyOrElse(to, (n: Int) => 0) + array(from))
        array.remove(from)
      }
      sum = sum + diff

      println(sum)
    }
  }
}
