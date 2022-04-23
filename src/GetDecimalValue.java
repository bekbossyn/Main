public class GetDecimalValue {

    public int getDecimalValue(ListNode head) {
        int sum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int power = 0;
        while (head != null) {
            head = head.next;
            power++;
        }
        dummy = dummy.next;
        while (dummy != null) {
            sum += dummy.val * (int) Math.pow(2, --power);
            dummy = dummy.next;
        }
        return sum;
    }

}
