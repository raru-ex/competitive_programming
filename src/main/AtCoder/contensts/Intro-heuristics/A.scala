import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

object Main extends App {
  val inputs: Seq[String] = scala.io.Source.stdin.getLines().toList
  val d  = inputs(0).toInt // 365
  val ci = inputs(1).split(" ").map(_.toInt)
  val sdi = HashMap.empty[Long, Seq[Long]]
  // 日付ごとに、満足度の配列を持つ
  inputs.splitAt(2)._2.zipWithIndex.foreach { case (line, index) =>
    sdi.update(index, line.split(" ").map(_.toLong))
  }

  solve(d, ci, sdi)

  // 1. 単純にでかい数を持っているものを抽出: Done
  // 2. 減少分と上昇分を考慮して最大になる物を選ぶ: Done
  // 3. 局所探索法というのを実装する下ごしらえで力尽きる
  def solve(d: Int, ci: Array[Int], sdi: HashMap[Long, Seq[Long]]): Unit = {
    val last = ArrayBuffer.fill(26)(0)
    val scoreHistory = ArrayBuffer.fill(d)(0L)
    val scoreDiffHistory = ArrayBuffer.fill(d)(0L)
    var score = 0L
    val range = Range(0, 26, 1)

    (0 until d).foreach { day =>
      val todayValues = sdi(day)
      val todayScores = range.map { i =>
        last(i) + todayValues(i)
      }

      val max = todayScores.max
      // println(s"max value = $max")
      // TODO: 同じ数値のものが複数ある可能性を考慮
      val maxIndexes = range.map { i =>
        if (max == todayScores(i)) {
          i
        } else {
          -1
        }
      }.filter(v => v != -1)

      val minCiOfTopValue      = maxIndexes.map(v => ci(v)).min
      val minCiOfTopValueIndex = range.filter(i => maxIndexes.exists(_ == i) && ci(i) == minCiOfTopValue).min

      // println(s"selected: $i")
      println(minCiOfTopValueIndex + 1)

      range.foreach { i =>
        last.update(i, last(i) + ci(i))
      }
      last.update(minCiOfTopValueIndex, 0)

      score = score - last.sum + max

      // スコアの履歴を残す
      scoreHistory.update(day, score)
      scoreDiffHistory.update(day, if(scoreHistory.isDefinedAt(day - 1)) {
        scoreHistory(i) + score
      } else {
        score
      })

    }

  }

}
