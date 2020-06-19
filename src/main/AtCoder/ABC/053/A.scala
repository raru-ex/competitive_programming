// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val nums = inputs.head.split(" ").map(_.toInt)
  val a = nums(0) match {
    case 1   => 14
    case num => num
  }
  val b = nums(1) match {
    case 1   => 14
    case num => num
  }

  println(if(a == b) {
    "Draw"
  } else if (a < b){
    "Bob"
  } else {
    "Alice"
  })
}
