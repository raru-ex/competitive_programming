// TODO: bit全探索でも解いてみる
object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nmx = inputs(0).split(" ").map(_.toInt)
  val n = nmx(0)
  val m = nmx(1)
  val x = nmx(2)
  val books = inputs.tail.map(_.split(" ").map(_.toInt))

  println(solve(n, m, x, books))

  def solve(n: Int, m: Int, x: Int, books: Seq[Array[Int]]): Int = {
    var minPrice = Int.MaxValue
    // n冊を、全組み合わせ出す
    (1 to n).foreach { i =>
      books.combinations(i).foreach { booksComb =>
        val understanding = scala.collection.mutable.ArrayBuffer.fill(m)(0)
        var price = 0
        booksComb.map { book =>
          price = price + book.head
          book.tail.zipWithIndex.foreach { case (point, i) =>
            understanding.update(i, understanding(i) + point)
          }

          if(understanding.filter(_ < x).size == 0 && minPrice > price) {
            minPrice = price

          }
        }
      }
    }

    if(minPrice == Int.MaxValue) {
      -1
    } else {
      minPrice
    }
  }
}
