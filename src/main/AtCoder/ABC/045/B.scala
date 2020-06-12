// package ABC044

// n!の計算
object Main extends App {
  // val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val inputs = Seq("abcb","aacb","bccc")
  val userStrMap = scala.collection.mutable.HashMap(('a', inputs(0)),('b', inputs(1)),('c', inputs(2)))

  println(solve(userStrMap))

  def solve(map: scala.collection.mutable.HashMap[Char, String]): Char = {
    var current = 'a'

    while(map(current).size != 0) {
      val next = map(current).head
      map.update(current, map(current).tail)
      current = next
    }

    current.toUpper
  }
}
