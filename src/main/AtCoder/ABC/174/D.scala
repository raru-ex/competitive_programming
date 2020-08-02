object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toInt
  val stones = inputs(1)

  println(solve(n, stones))

  def solve(n: Int, stones: String): Int = {
    val rIndexes = scala.collection.mutable.ArrayBuffer.empty[Int]
    var ans = 0

    stones.zipWithIndex.foreach { case (c: Char, i: Int) =>
      if(c == 'R') {
        rIndexes.append(i)
      }
    }

    val rSize = rIndexes.size
    if (rSize == 0) {
      return 0
    }

    var rIndex = 0
    var rEnd = rIndexes.size - 1

    (0 until stones.length).foreach { i =>
      // 白は赤と交換
      if(stones(i) == 'W' && i < rIndexes(rEnd)) {
        ans = ans + 1
        rEnd = rEnd - 1
      }

      if (rEnd < 0) {
        return ans
      }
    }

    ans

  }
}
