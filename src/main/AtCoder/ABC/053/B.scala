// package ABC046

object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs: Seq[String] = Seq("HASFJGHOGAKZZFEGA")
  val s = inputs.head

  println(solve(s))

  // 両端から探して左はA,右はZが最初に出た位置を記録
  // 両方が更新されたら、そのときの文字長をとって終わり
  // 必ずA-Zになるという前提があるため、loopの外ではなんとなく-1をreturn
  private def solve(s: String): Int = {
    var aIndex = -1
    var zIndex = -1
    val end = s.size - 1
    (0 until end).foreach { i =>
      s(i) match {
        case 'A' if aIndex == -1 => aIndex = i
        case _ => ()
      }

      s(end - i) match {
        case 'Z' if zIndex == -1 => zIndex = end - i
        case _ => ()
      }

      if(aIndex != -1 && zIndex != -1) {
        return zIndex - aIndex + 1
      }
    }
    return -1
  }
}
