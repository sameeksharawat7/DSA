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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null){
            return head;
        }
        ListNode pres=head;
        ListNode prev=null;
        while(true){
            // Check if at least k nodes are present
            ListNode temp = pres;
            int count = 0;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }

            if (count < k) {
                break;
            }
            ListNode last=prev;
            ListNode newEnd=pres;
            ListNode next=pres.next;
            for(int i=0;pres!=null && i<k;i++){
                pres.next=prev;
                prev=pres;
                pres=next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prev;
            }
            else{
                head=prev;
            }
            newEnd.next=pres;
            if(pres== null){
                break;
            }
            prev=newEnd;
        }
        return head;
    }
}