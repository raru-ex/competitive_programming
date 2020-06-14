// 間に合う
object Main extends App {
  // val inputs: IndexedSeq[String] = scala.io.Source.stdin.getLines().toIndexedSeq
  val inputs = IndexedSeq("4", "5 5 5 5")
  // val inputs = Seq("10", "33 18 45 28 8 19 89 86 2 4")

  val n = inputs(0).toInt
  val nums = inputs(1).split(" ").map(_.toInt)

  println(solve(n, nums))

  def solve(n: Int, nums: IndexedSeq[Int]): Int = {
    val sortedNums = nums.sorted
    val max = sortedNums(sortedNums.size - 1)
    var divSeq = sortedNums
    // 不要な配列が増えるが、添字で直接処理できるように入力の最大値分のデータを用意
    val results = scala.collection.mutable.IndexedSeq.fill(max + 1)(0)

    // 入力配列の値を添字に利用するのでloop回数はnでいい
    (1 to n).foreach { i =>
      // 分母
      val div = divSeq(i-1)

      // 昇順で処理しているので、0じゃないものは過去に割られており、その先の倍数は処理済。スキップして良い
      // <= 1にしてelseなしでも良いが、若干遅くなる
      if(results(div) == 0) {
        Range.inclusive(div, max, div).foreach { j =>
          results.update(j, results(j) + 1)
        }
      } else {
        // 1になってる人だけを抽出したいので2にしている
        results.update(div, 2)
      }
    }

    // 入力に関係ない範囲を無視するためにsortedNumsのデータでアクセスしてチェック
    var result = 0
    sortedNums.foreach { v =>
      if (results(v) == 1) {
        result = result + 1
      }
    }
    return result
  }
}
