// Last updated: 8/12/2026, 9:02:13 AM

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode h2=null;
        while(head != null){
            ListNode temp = head;
            head = head.next;
            temp.next=h2;
            h2=temp;
        }
        return h2;
    }
}