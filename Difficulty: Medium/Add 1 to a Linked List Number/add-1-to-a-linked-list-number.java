/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        Node rereverse=reverseList(head);
        Node temp=rereverse;
        int carry=1;
        while(temp != null && carry>0){
            int a=temp.data+carry;
            temp.data=a%10;
            carry=a/10;
            if (carry == 0){
                break;
            }

            if (temp.next == null && carry == 1) {
                temp.next = new Node(1);
                carry = 0;
            }
            temp=temp.next;
        }
        
        return reverseList(rereverse);
        
    }
    public Node reverseList(Node head) {
        if(head==null){
            return null;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}