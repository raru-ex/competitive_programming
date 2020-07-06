object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val hwk = inputs.head.split(" ").map(_.toInt)
  val h   = hwk(0)
  val w   = hwk(1)
  val k   = hwk(2)
  val lines = inputs.tail

  println(solve(h, w, k, lines))

  def solve(h: Int, w: Int, k: Int, lines: Seq[String]): Int = {
    var ans = 0
    // bit探索の全組み合わせを作成
    (0 until 1 << h).foreach { condI =>
      (0 until 1 << w).foreach { condJ =>

        var count = 0
        // 削除されてない行列の#を対象に数える
        (0 until h).foreach { i =>
          (0 until w).foreach { j =>
            // 自分の場所が削除されてないとき
            if(
              (condI >> i & 1) != 1 &&
              (condJ >> j & 1) != 1 &&
              lines(i)(j) == '#'
            ) {
              count = count + 1
            }
          }
        }

        if(count == k) {
          ans = ans + 1
        }
      }
    }
    ans
  }
}
