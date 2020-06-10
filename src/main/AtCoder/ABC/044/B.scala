// package ABC044

object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("abaccaba")
  val w = inputs.head

  println(solve(w))

  def solve(w: String): String = {
    val charMap = scala.collection.mutable.HashMap.empty[Char, Boolean]
    w.toSeq.foreach { c =>
      if (charMap.contains(c)) {
        charMap.update(c, !charMap(c))
      } else {
        charMap.update(c, false)
      }
    }

    val resultSet = charMap.values.toSet
    if (resultSet.size == 1 && resultSet.head) {
      "Yes"
    } else {
      "No"
    }
  }
}
