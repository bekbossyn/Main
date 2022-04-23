public class GetDecimalValue {

    public int getDecimalValue(ListNode head) {
        int sum = head.val;
        while (head.next != null) {
            sum = sum * 2 + head.next.val;
            head = head.next;
        }
        return sum;
    }

}
