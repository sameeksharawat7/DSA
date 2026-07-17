/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node temp=head;
        Node zerohead=new Node(-1);
        Node onehead=new Node(-1);
        Node twohead=new Node(-1);
        
        Node zero=zerohead;
        Node one=onehead;
        Node two=twohead;
        
        while(temp!=null){
            Node next=temp.next;
            temp.next=null;
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=next;
        }
        zero.next = (onehead.next != null) ? onehead.next : twohead.next;
        one.next = twohead.next;
        two.next = null;

        return zerohead.next;
    }
}