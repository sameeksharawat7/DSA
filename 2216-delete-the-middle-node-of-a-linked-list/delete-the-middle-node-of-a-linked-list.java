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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        } 
        if(length==1){
            return null;
        }
        int mid=length/2;
        temp=head;
        while(mid>1){
            temp=temp.next;
            mid-=1;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
    }
}