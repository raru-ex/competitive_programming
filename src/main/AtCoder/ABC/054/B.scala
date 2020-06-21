object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val n = nums(0)
  val m = nums(1)
  val images = inputs.tail

  println(solve(n, m, images))

  private def solve(n: Int, m: Int, images: Seq[String]): String = {
    val loopEnd = n - m
    val imagesTup = images.splitAt(n)
    val nImage  = imagesTup._1
    val mImage  = imagesTup._2
    val checkStart = mImage(0)(0)

    (0 to loopEnd).foreach { i =>
      val line = nImage(i)

      (0 to loopEnd).foreach { j =>
        if(line(j) == checkStart) {
          var ok = true
          (0 until m).foreach { k =>
            val checkLine = images(i + k).splitAt(j)._2.splitAt(m)._1
            if( checkLine != mImage(k)) {
              ok = false
            }
          }

          if(ok) {
            return "Yes"
          }
        }
      }

    }
    return "No"
  }
}

