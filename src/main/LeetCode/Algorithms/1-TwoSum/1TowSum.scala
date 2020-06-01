import scala.annotation.tailrec

object Solution extends App {

  twoSum(Array(2, 7, 11, 15), 9)

  // 配列から2つの数字を足算してtargetの値になったindexの組み合わせを返す
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val twoSum = search(0, nums, target, Set()).filter{ t: (Int, Int) => (t._1 != -1 && t._2 != -1) }.head
    Array(twoSum._1, twoSum._2)
  }

  // 2重ループ的なものを末尾再起で実装
  // Memory節約のためSetで実装
  @tailrec
  def search(index: Int, nums: Array[Int], target: Int, result: Set[(Int, Int)]): Set[(Int,Int)] = {
    if (1 < nums.size) {
      val head = nums.head
      val tail = nums.tail
      val pair = target - head
        val tupleArray =  tail.zipWithIndex.map { case (num, j) =>
          if (num == pair) {
            (index, j + index + 1)
          } else {
            // Setで圧縮するために固定値で返す
            (-1, -1)
          }
        }
        search(index + 1, tail, target, tupleArray.toSet ++ result)
    } else {
      result
    }
  }
}
