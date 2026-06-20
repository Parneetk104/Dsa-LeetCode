/*
ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null)? l1.val: 0;
            int y = (l2 != null)? l2.val: 0;
            int sum = x + y + carry;
            carry = sum / 10;        //quotient chhiye
            curr.next = new ListNode(sum % 10);     //last digit to add /store in carry concept
            curr = curr.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return dummy.next;*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode tp = dummy;
        int carry = 0;
        while(temp1 != null || temp2 != null || carry != 0){
            int sum = carry;
            if(temp1 != null){
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum += temp2.val;
                temp2 = temp2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;
            tp.next = new ListNode(digit);
            tp = tp.next;
        }

        return dummy.next;

        
    }
}