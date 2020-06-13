// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("10 10 5", "1 6 1", "4 1 3", "6 9 4", "9 4 2", "3 1 3")
  val nums   = inputs.head.split(" ").map(_.toInt)
  val pointSeq = inputs.tail
  val width  = nums(0)
  val height = nums(1)
  val point  = nums(2)

  println(solve(width, height, pointSeq))

  private def solve(w: Int, h: Int, points: Seq[String]): Int = {
    val hash = scala.collection.mutable.HashMap((1,0), (2, w), (3, 0), (4 ,h))

    points.foreach { str =>
      val inputs = str.split(" ").map(_.toInt)
      val x = inputs(0)
      val y = inputs(1)
      val a = inputs(2)

      a match {
        case 1 if(hash(a) < x) => hash.update(a, x)
        case 2 if(hash(a) > x) => hash.update(a, x)
        case 3 if(hash(a) < y) => hash.update(a, y)
        case 4 if(hash(a) > y) => hash.update(a, y)
        case _ => ()
      }
    }
    val whiteX = hash(2) - hash(1)
    val whiteY = hash(4) - hash(3)

    (whiteX, whiteY) match {
      case (x, y) if (0 < x && 0 < y) => x * y
      case _ => 0
    }
  }
}
