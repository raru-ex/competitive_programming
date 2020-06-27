object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toInt

  println(solve(n))

  def solve(n: Int): Long = {
    var ans = 0L

    // D2の解き方をさらに簡略化
    // iが約数になる数は1-nの間に(n/i)個ある。
    // n=8, i=1のとき約数は8個あり、x倍された数値として足し算するので1,2,3,4,5,6,7,8の和になる
    // n=8, i=2のとき約数は4個あり、x倍された数値として足し算するのでsum(2,4,6,8) => 2 * sum(1,2,3,4)になる
    // n=8, i=3のとき約数は2個あり、x倍された数値として足し算するのでsum(3,6)     => 3 * sum(1,2)になる
    (1 to n).foreach { i =>
      ans = ans + i * sumAll(n/i)
    }

    return ans
  }

  private def sumAll(n: Int): Long = {
    (n * (n + 1L)) / 2
  }
}
