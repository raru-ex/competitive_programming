import scala.util.Try
import scala.util.Success
import scala.util.Failure

object Solution extends App {

  println(reverseInteger(123))
  println(reverseInteger(-321))
  println(reverseInteger(120))

  // 言語パワーに頼る実装
  // %10で削っていく方法もあり
  def reverseInteger(x: Int): Int = {
    Try {
      if (x < 0) {
        Math.abs(x).toString.reverse.toInt * -1
      } else {
        x.toString.reverse.toInt
      }
    } match {
      case Success(result) => result
      case Failure(_)      => 0
    }
  }
}
