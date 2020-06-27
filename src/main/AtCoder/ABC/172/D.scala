// time out
object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toInt

  println(solve(n))

  def solve(n: Int): Long = {
    var sum = 0L
    (1 to n).foreach { i =>
      sum = sum + i * f(i)
    }
    return sum
  }

  private def f(n: Int): Int = {
    var count = 0
    var i = 1
    while(i * i <= n){
      if (n % i == 0) {
        count = count + 1

        if(i != n / i) {
          count = count + 1
        }
      }

      i = i + 1
    }

    return count
  }
}
