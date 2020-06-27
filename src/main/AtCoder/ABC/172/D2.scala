object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toInt

  println(solve(n))

  def solve(n: Int): Long = {
    var ans = 0L

    // 1〜nの約数を順番に処理している
    // 上段のloopで1の約数をもつn以下の数を列挙、2の約数を持つn以下の数を列挙という動きになっている
    // n=8のとき1が約数になる数は1,2,3,4,5,6,7,8
    // n=8のとき2が約数になる数は2,4,6,8
    // n=8のとき3が約数になる数は3,6
    // このとき内側のloopをiから初めて、i stepで処理することで効率よく処理できる
    // 個数かけるxは自分自身が、xになるためjを足せばいい
    (1 to n).foreach { i =>
      (i to n by i).foreach { j =>
        ans = ans + j
      }
    }

    return ans
  }
}

