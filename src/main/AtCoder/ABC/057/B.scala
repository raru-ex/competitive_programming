object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nm = inputs.head.split(" ").map(_.toInt)
  val n = nm(0)
  val m = nm(1)
  val students = inputs.tail.splitAt(n)._1
  val points = inputs.tail.splitAt(n)._2

  solve(students, points)

  private def solve(students: Seq[String], points: Seq[String]): Unit = {
    val pointsSeq = points.map(_.split(" ").map(_.toInt))

    students.foreach { s =>
      val sp = s.split(" ").map(_.toInt)

      var min = Int.MaxValue
      var nearPoint = 0
      pointsSeq.zipWithIndex.foreach { case (point, i) =>
        val diff = Math.abs(sp(0) - point(0)) + Math.abs(sp(1) - point(1))
        if(diff < min) {
          min = diff
          nearPoint = i + 1
        }
      }
      println(nearPoint)
    }
  }
}
