object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val k = inputs.head.toInt

  println(solve(k))

  def solve(k: Int): Int = {
    val set = scala.collection.mutable.Set.empty[Int]
    var mod = 7 % k
    var count = 1

    (0 until k).foreach { i =>
      if(set.contains(mod)) {
        return -1
      }


      if(mod == 0) {
        return count
      }

      mod = (mod * 10 + 7) % k
      count = count + 1
    }

    -1
  }
}
