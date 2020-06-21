object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val n = inputs.head.toLong
  // 1:a, 26;z, 27:aa

  println(solve(n))

  def solve(n: Long): String = {
    var dog = n
    val str  = "abcdefghijklmnopqrstuvwxyz"
    val base = 26
    var name = ""

    do {
      dog = dog - 1
      val p = dog % base
      dog = dog / base
      name = name + str(p.toInt)

    } while(dog > 0)

    name.reverse
  }
}
