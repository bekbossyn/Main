class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        int res = 0;
        ListNode l4 = l3;
        while (true)	{
            int v1 = 0;
            if (l1 != null)	{
                v1 = l1.val;
            }
            int v2 = 0;
            if (l2 != null)	{
                v2 = l2.val;
            }
            res = res + v1 + v2;
            l3.val = res % 10;
            res /= 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            if (l1 == null && l2 == null)	{
                break;
            } else {
                l3.next = new ListNode();
                l3 = l3.next;
            }

        }
        if (res > 0)	{
            l3.next = new ListNode();
            l3 = l3.next;
            l3.val = res;
        }
        return l4;
    }
}
