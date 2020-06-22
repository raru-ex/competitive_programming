object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val a = inputs(0)
  val b = inputs(1)

  println(solve(a, b))

  private def solve(a: String, b: String): String = {
    val as = a.size
    val bs = b.size
    if(as > bs) {
      return "GREATER"
    } else if (as < bs){
      return "LESS"
    } else {
      (0 until as).foreach { i =>
        val ac = a(i).toString.toInt
        val bc = b(i).toString.toInt

        if(ac > bc) {
          return "GREATER"
        } else if (ac < bc){
          return "LESS"
        }
      }

      return "EQUAL"
    }
  }
}
