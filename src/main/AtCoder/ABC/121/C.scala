object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nm = inputs.head.split(" ").map(_.toInt)
  val n  = nm(0)
  val m  = nm(1)

  println(solve(n,m, inputs.tail))

  def solve(n: Int, m: Int, ab: Seq[String]): Long = {
    val hash = scala.collection.mutable.HashMap.empty[Long, Long]
    var ans = 0L
    var nowStock = 0L
    val keySet = ab.map { line =>
      val lineNum = line.split(" ").map(_.toLong)
      val key = lineNum(0)
      hash.update(key, hash.applyOrElse(key, (n: Long) => 0L) + lineNum(1))
      key
    }.distinct.sorted

    keySet.foreach { price =>
      val stock = hash(price)

      if (m < stock + nowStock) {
        val v = (m - nowStock)
        ans = ans + v * price
        nowStock = nowStock + v
      } else {
        nowStock = nowStock + stock
        ans = ans + (stock * price)
      }

      if (m == nowStock) {
        return ans
      }

    }

    -1L
  }
}
