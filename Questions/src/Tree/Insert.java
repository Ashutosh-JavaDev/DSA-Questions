package Tree;

class Node {
    Node left;
    Node Right;
    int data;

    Node(int data) {
        this.data = data;
    }
    public Node insertInNull(Node root ,int val){
        if(root==null){
             root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insertInNull(root.left, val);
        }
        else{
            root.Right=insertInNull(root.Right, val);
        }
        return root;
    }
}

public class Insert {

}
