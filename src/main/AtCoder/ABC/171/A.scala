object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val uppers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val str = inputs.head

  println(if(uppers.contains(str)) { "A" } else { "a" })

}
