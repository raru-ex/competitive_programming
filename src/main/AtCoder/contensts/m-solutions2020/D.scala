object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n  = inputs(0).toInt
  val ai = inputs(1).split(" ").map(_.toInt)

  println(solve(n, ai))

  def solve(n: Int, ai: Seq[Int]): Long = {
    var start = ai(0).toLong
    val size  = ai.size
    var money = 1000L
    var stock = 0L

    // 2^40だとLongじゃないと入らない
    (1 until size).foreach { i =>
      val currentStockPrice = ai(i).toLong
      if(start < currentStockPrice) {
        // 過去の改竄
        stock = money / start // 安かったときに全力買い
        money = money % start // 残金
        // println(s"購入: stock = $stock, money = $money")

        // 現在の処理
        money = money + (stock * currentStockPrice) // 今の値段で全部売る
        stock = 0
        start = currentStockPrice
        // println(s"売却: stock = $stock, money = $money")
      } else if (start > currentStockPrice) {
        start = currentStockPrice
      }
      // println(s"仕入れ値: $start")
    }

    money
  }
}
