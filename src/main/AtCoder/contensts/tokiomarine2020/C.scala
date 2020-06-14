// TLE: 処理時間がかかりすぎている。累積和とかimos法というのがあるらしい
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("5 2", "1 0 0 1 0")
  // val nums   = inputs.head.split(" ").map(_.toInt)
  val nums = inputs(0).split(" ").map(_.toInt)
  val n = nums(0)
  val k = nums(1)
  val lamps = inputs(1).split(" ").map(_.toInt)


  println(solve(n, k, lamps))

  private def solve(n: Int, k: Int, lamps: Seq[Int]): String = {
    var currentPower = scala.collection.mutable.ArrayBuffer.empty[Int]
    lamps.foreach { v =>
      currentPower.append(v)
    }

    (1 to k).foreach { _ =>

      // 範囲初期化
      val range = scala.collection.mutable.ArrayBuffer.fill(n + 1)(0)
      // 要素を走査
      (0 until n).foreach { i =>
        val power = currentPower(i)

        // 開始、終了を挟み込み
        val left = Math.max(0, i - power)
        val right = Math.min(i + power + 1, n)

        range.update(left,  range(left) + 1)
        range.update(right, range(right) - 1)
      }
      // 累積和を計算
      (1 to n).foreach { i =>
        range.update(i, range(i - 1) + range(i))
      }
      // 末端が余分なので削除して次の光として保持
      val nextPower = range.dropRight(1)

      // 全体が最高に光ってたら終了
      if (nextPower == currentPower) {
        return currentPower.mkString(" ")
      }

      // 次の光を保持
      currentPower = nextPower
    }
    currentPower.mkString(" ")
  }
}
