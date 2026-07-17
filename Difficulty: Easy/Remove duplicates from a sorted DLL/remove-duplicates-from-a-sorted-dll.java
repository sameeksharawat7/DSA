/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
         Node temp=headRef;
         while(temp!=null && temp.next != null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next; 
                if(temp.next!=null){
                    temp.next.prev=temp;
                }
            } 
            else{
                temp=temp.next;
            }
         }
         return headRef;
    }
}