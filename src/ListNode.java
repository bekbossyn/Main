public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next)    {
        this.val = val;
        this.next = next;
    }

// ####################################################################################################################

    public String toString()  {
        String result = "[";
        ListNode current = this;
        while (current.next != null)    {
            result += current.val + ", ";
            current = current.next;
        }
        result += current.val + "]";
        return result;
    }

    public String toNormal()  {
        String result ="";
        ListNode current = this;
        while (current.next != null)    {
            result += current.val;
            current = current.next;
        }
        result += current.val;
        return new StringBuilder(result).reverse().toString();
    }

    public String toLinkedString()  {
        String result = "tail -> ";
        ListNode current = this;
        while (current.next != null)    {
            result += current.val + " -> ";
            current = current.next;
        }
        result += current.val + " -> head";
        return result;
    }

    public ListNode toListNode(String num)  {
        ListNode l = new ListNode();
        ListNode result = l;
        for (int i = num.length() - 1; i >= 0; i--)  {
            if (i != num.length() - 1) {
                l.next = new ListNode();
                l = l.next;
            }
            l.val = num.charAt(i) - '0';
        }
        return result;
    }
}
