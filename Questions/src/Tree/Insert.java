package Tree;

class Node {
    Node root;
    Node left;
    Node Right;
    int data;

    Node(int data) {
        this.data = data;
    }
    public void insertInNull(int val){
        if(root==null){
            Node newNode=new Node(val);
            root=newNode;
        }
    }
}

public class Insert {

}
