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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp=head;
        int length=0;
        ListNode last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
            length++;
        }
        k=k%length;
        if (k == 0) {
            return head;
        }
        last.next=head;
        temp=head;
        for(int i=0;i<length-k-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}