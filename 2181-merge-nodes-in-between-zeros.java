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
    public ListNode mergeNodes(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head.next;
        int sum = 0;
        while(n2 != null){
            if(n2.val == 0){
                n1.val = sum;
                
                //Last Node
                if(n2.next == null){
                    n1.next = null;
                    break;
                }

                n1.next = n2;

                n1 = n2;
                n2 = n2.next;
                sum = 0;

                continue;
            }

            sum += n2.val;
            n2 = n2.next;
        }

        return head;

        
    }

}