object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nm = inputs(0).split(" ").map(_.toInt)
  val n = nm(0)
  val m = nm(1)

  println(solve(n, m))

  def solve(n: Int, m: Int): Double = {
    // 長針: 1min:  360 / 60 => 6
    // 短針: 1hour: 360 / 12 => 30  1min: 30/60 => 0.5
    val long  = (30 * n + 0.5D * m) % 360
    val short = (6 * m)
    val rad   = Math.abs(long - short)
    // println(s"long = $long, short = $short, rad = $rad")

    return Math.min(rad, 360D - rad)
  }
}
