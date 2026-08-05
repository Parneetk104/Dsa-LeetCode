/**
 int pos = 
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            boolean cycle = false;
            if(slow == fast){
                cycle =  true;
                return 
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;

        if(fast == null || fast.next == null){
            return false;
        }
        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return true;
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean hascycle = false;
        while(fast != null && fast.next != null){
        
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
               ListNode b = head;
               while(b != slow){
                b = b.next;
                slow = slow.next;
                }
                return b;
            }
            
        }
        return null;
        
    }
}