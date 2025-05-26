package Tree;
class Node{
    Node Left;
    Node Right;
    int data;
    Node(int data){
        this.data=data;
    }
    public static Node insertion(Node root,int val){
        if(root==null){
            return root;
        }
        else if(root.data>val){
            root.Left=insertion(root.Left, val);
        }
        else{
            root.Right=insertion(root.Right, val);
        }
        return root;
    }

}
public class SearchBst {
    
}
