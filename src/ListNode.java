public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

// ####################################################################################################################

    public String toString() {
        String result = "[";
        ListNode current = this;
        while (current.next != null) {
            result += current.val + ", ";
            current = current.next;
        }
        result += current.val + "]";
        return result;
    }

    public String toNormal() {
        String result = "";
        ListNode current = this;
        while (current.next != null) {
            result += current.val;
            current = current.next;
        }
        result += current.val;
        return new StringBuilder(result).reverse().toString();
    }

    public String toLinkedString() {
        String result = "tail -> ";
        ListNode current = this;
        while (current.next != null) {
            result += current.val + " -> ";
            current = current.next;
        }
        result += current.val + " -> head";
        return result;
    }

    public ListNode toListNode(String num) {
        // sample: "13,45,32433,23,4,1,,33,3,3,4,5,4,343,2332"
        ListNode l = new ListNode();
        ListNode result = l;
        String[] s = num.split("\\W+");
        for (String a : s) {
            l.next = new ListNode();
            l = l.next;
            l.val = Integer.parseInt(a);
        }
        return result.next;
    }
}
