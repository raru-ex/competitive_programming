object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("2 2", "*.", ".*")
  val hw = inputs.head.split(" ").map(_.toInt)
  val h = hw(0)
  val w = hw(1)
  val image = inputs.tail

  println(solve(h, w, image))

  private def solve(h: Int, w: Int, image: Seq[String]): String = {
    val longImage = scala.collection.mutable.ArrayBuffer.empty[String]

    (0 until h).foreach { i =>
      longImage.append(image(i))
      longImage.append(image(i))
    }
    longImage.toSeq.mkString("\n")
  }
}
