 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 } 
class add2number {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode sum = new ListNode(0);
        ListNode cur = sum;

        int carry = 0;

        while (temp1 != null || temp2 != null) {

            int x = 0;
            int y = 0;

            if (temp1 != null) {
                x = temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                y = temp2.val;
                temp2 = temp2.next;
            }

            int dummy = x + y + carry;
            int digit = dummy % 10;
            carry = dummy / 10;

            cur.next = new ListNode(digit);
            cur = cur.next;
        }

        if (carry > 0) {
            cur.next = new ListNode(carry);
        }

        return sum.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Second Linked List: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        add2number obj = new add2number();

        ListNode result = obj.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}