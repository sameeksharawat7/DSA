/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        if(root==null || root.next==null){
            return root;
        }
        Node mergedhead=flatten(root.next);
        return merge(root,mergedhead);
       
    }
    public Node merge(Node head1,Node head2){
        Node dummyNode=new Node(-1);
        Node res=dummyNode;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                res.bottom=head1;
                res=head1;
                head1=head1.bottom;
            }else {
                res.bottom=head2;
                res=head2;
                head2=head2.bottom;
            }
            res.next = null;
        }
        if(head1!=null){
            res.bottom=head1;
        }
        else{
            res.bottom=head2;
        }
        return dummyNode.bottom;
    }
}