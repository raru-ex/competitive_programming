// package ABC046

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  // val inputs = Seq("56 25 31")
  val vowel = "aiueo"
  val str = inputs.head

  println(
    if(vowel.contains(str)) { "vowel" } else { "consonant" }
  )
}
