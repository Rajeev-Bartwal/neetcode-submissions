/**
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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode sec = slow.next;
        slow.next =null;

        while(sec != null){
            ListNode temp = sec.next;
            sec.next = prev;
            prev = sec;
            sec = temp;
        }

        while( prev != null){

            dummy.next = head;
            head = head.next;
            dummy = dummy.next;

            dummy.next = prev;
            prev = prev.next;
            dummy = dummy.next;
        }
 
        if(head != null) dummy.next = head;
        System.out.print(head.val);

        head = ans.next;
    }
}
