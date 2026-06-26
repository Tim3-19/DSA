
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null)
        return null;
        ListNode curr=head.next;
        ListNode temp = head.next;
        ListNode prev = head;
        prev.next = null;
        while(curr!=null)
        {
            temp=temp.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
            
            

        }
        return prev;
    }
}