// Infinityになっちゃう
// char bitを引き算できる関数を作って、a < bの間引き続ければ良さそう
object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n    = inputs(0).toInt
  val bit  = inputs(1)

  solve(n, bit)

  def solve(n: Int, bit: String): Unit = {
    (0 until n).foreach { i =>
      val target = bit.updated(i, bit(i) match {
        case '1' => '0'
        case '0' => '1'
      })

      var tmp = Integer.parseInt(target, 2)
      var count = 0
      while (tmp != 0) {
        val popcount = tmp.toBinaryString.filter(_ == '1').size
        tmp = tmp % popcount
        count = count + 1
      }
      println(count)
    }
  }

}
