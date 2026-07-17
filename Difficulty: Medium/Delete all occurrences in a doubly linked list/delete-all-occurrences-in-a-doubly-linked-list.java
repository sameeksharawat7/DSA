/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        while (head != null && head.data == x) {
            head = head.next;
            if (head != null){
                head.prev = null;
            }
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                temp.prev.next = temp.next;
                if(temp.next != null){
                    temp.next.prev = temp.prev;
                }

            }
            temp=temp.next;
        }
        return head;
    }
}