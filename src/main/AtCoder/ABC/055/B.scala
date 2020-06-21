// 足し引き、掛け算までは直感的。その先は謎なので学ぶ必要がある。 https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a
object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val i = inputs.head.toInt
  println(solve(i))

  private def solve(i: Int): Long = {
    ((1 to i).foldLeft(1L){ (acc, v) => 
        acc * v % 1000000007
    }).toLong
  }
}
