public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode list2next = list2.next;
        ListNode list1next = list1.next;
        if (list1.val > list2.val) {
            // start list2
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        } else {
            // start list1
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
//        return mergeTwoLists(list1next,list2next);
    }

}
