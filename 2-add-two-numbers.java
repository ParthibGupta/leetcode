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

    public reverseNum(int n){
        int newNum = 0;
        while(n > 0){
            int rem = n % 10;
            newNum = newNum*10 + rem;
            n /= 10;
        }
        return newNum;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1 = 0;
        while(l1 != null){
            int k = l1.val;
            n1 = n1*10 + k;
            l1 = l1.next;
        }

        int n2 = 0;
        while(l2 != null){
            int k = l2.val;
            n2 = n2*10 + k;
            l2 = l2.next;
        }
        n1 = reverseNum(n1);
        n2 = reverseNum(n2);
        int sum = n1+n2;
    
        ListNode newList =  new ListNode();
        
        while(sum > 0){
            newList.val = sum % 10;
            sum /= 10;
            if(sum > 0) newList.next = new ListNode();
        }
    }
}