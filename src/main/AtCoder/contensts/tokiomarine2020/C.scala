// TLE: 処理時間がかかりすぎている
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("5 2", "1 0 0 1 0")
  // val nums   = inputs.head.split(" ").map(_.toInt)
  val nums = inputs(0).split(" ").map(_.toInt)
  val n = nums(0)
  val k = nums(1)
  val ramps = inputs(1).split(" ").map(_.toInt)

  println(solve(k, ramps))

  private def solve(k: Int, ramps: Seq[Int]): String = {
    val size = ramps.size
    var currentPower = scala.collection.mutable.ArrayBuffer.empty[Int]
    ramps.foreach{v =>
        currentPower.append(v)
    }

    (1 to k).foreach{ _ =>
      val nextPower = scala.collection.mutable.ArrayBuffer.fill(ramps.size)(0)

      (0 until size).foreach { i =>
        val light = currentPower(i)
        val range = Range.inclusive(Math.max(0, i - light), Math.min(i + light, size - 1), 1)
        println(range.toString)

        range.foreach { j =>
          nextPower.update(j, nextPower(j) + 1)
        }
      }
      currentPower = nextPower.clone()
      println(s"""now => ${currentPower}""")
    }
    currentPower.toSeq.mkString(" ")
  }
}
