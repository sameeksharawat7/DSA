/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node r=head;
        Node l=head;
        while(r.next!=null){
            r=r.next;
        }
        while(l!=r && l.prev!=r){
            int a=l.data+r.data;
            if(target==a){
                ans.add(new ArrayList<>(Arrays.asList(l.data, r.data)));
                l=l.next;
                r=r.prev;
            }
            else if(target<a){
                r=r.prev;
            }
            else{
                l=l.next;
            }
        }
        return ans;
    }
}
