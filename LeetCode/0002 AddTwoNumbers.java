

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry =0;
        
        while(l1!=null || l2!=null)//traversing the linked list
        {
            int sum=0;
            if(l1!=null)
            {
                sum+= l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            sum%=10;
            ListNode next_node = new ListNode(sum);
            temp.next=next_node;
            next_node.next=null;
            temp=temp.next;
            
        }
        if(carry>0)//checking for extra carry at the last node
        {
            temp.next= new ListNode(carry);
        }

        return head.next;//because the first node contains an initial 0
        
         
        
        
     
     
     
       
        
        
        
    }
}

