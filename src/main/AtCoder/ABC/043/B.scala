// package ABC043

object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs  = Seq("01B0")
  val charSeq = inputs.head.toSeq

  println(solve(charSeq))

  def solve(chars: Seq[Char]): String = {
    val charBuffer = scala.collection.mutable.ArrayBuffer.empty[Char]
    chars.foreach { c =>
      c match {
        case '0'  => charBuffer.append(c)
        case '1'  => charBuffer.append(c)
        case 'B' if charBuffer.length > 0 => charBuffer.remove(charBuffer.length - 1)
        case _    => ()
      }
    }
    charBuffer.mkString
  }
}
