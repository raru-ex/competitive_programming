object Solution extends App {

  println(addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3, null))), new ListNode(5, new ListNode(6, new ListNode(4, null)))))

  // 配列から2つの数字を足算してtargetの値になったindexの組み合わせを返す
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
      solve(l1, l2, new ListNode())
  }

  // 桁数がえげつない数字がくるので、坦々と処理すべき
  private def solve(l1: ListNode, l2: ListNode, result: ListNode): ListNode = {
    val curNum = (result.x + l1.x + l2.x) % 10
    val moveUp = (result.x + l1.x + l2.x) / 10
    result.x = curNum

    (l1.next, l2.next) match {
      case (null,  null)  =>
        if(moveUp != 0) {
          result.next = new ListNode(moveUp, null)
        }
      case (next1, null)  =>
        result.next = solve(next1, new ListNode(), new ListNode(moveUp))
      case (null,  next2) =>
        result.next = solve(new ListNode(), next2, new ListNode(moveUp))
      case (next1, next2) =>
        result.next = solve(l1.next, l2.next, new ListNode(moveUp, null))
    }
    result
  }

}

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}
