// Last updated: 8/12/2026, 9:03:01 AM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=head;
        while(head != null && head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return res;
    }
}