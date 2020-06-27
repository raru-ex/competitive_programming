object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val line1  = inputs.head.split(" ").map(_.toInt)
  val aBooks = inputs(1).split(" ").map(_.toInt)
  val bBooks = inputs(2).split(" ").map(_.toInt)

  println(solve(line1(0), line1(1), line1(2), aBooks, bBooks))

  def solve(n: Int, m: Int, k: Int, aBooks: Array[Int], bBooks: Array[Int]): Int = {
    val a = scala.collection.mutable.ArrayBuffer(0L)
    val b = scala.collection.mutable.ArrayBuffer(0L)

    (0 until n).foreach { i =>
      a.append(a(i) + aBooks(i))
    }
    (0 until m).foreach { i =>
      b.append(b(i) + bBooks(i))
    }

    var ans = 0
    var j   = m

    (0 until n + 1).foreach { i =>
      if(a(i) > k) {
        return ans
      }

      while(b(j) > k - a(i)) {
        j = j - 1
      }

      ans = Math.max(ans, i + j)
    }

    return ans
  }
}
