import scala.annotation.tailrec

object Solution extends App {

  // twoSum(Array(2, 7, 11, 15), 9)
  twoSum(Array(3,2,4), 6)

  // 配列から2つの数字を足算してtargetの値になったindexの組み合わせを返す
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numWithIndex = nums.zipWithIndex
    val numsMap = numWithIndex.toMap

    numWithIndex.foreach { case (num, j) =>
      val pair = target - num
      numsMap.get(pair) match {
        case Some(key) if j < key => return Array(j, key)
        case _ => ()
      }
    }
    Array(0, 0)
  }

}
