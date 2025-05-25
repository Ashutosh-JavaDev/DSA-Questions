package Tree;

class Node {
    Node left;
    Node Right;
    int data;

    Node(int data) {
        this.data = data;
    }

    public Node insertInNull(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insertInNull(root.left, val);
        } else {
            root.Right = insertInNull(root.Right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.Right);

    }
}

public class Insert {
    public static void main(String[] args) {
        Node newNode = new Node(0);
        int arr[] = { 3, 1, 4, 2, 5, 4 };
        Node root = null;
        for (int i =0;i<arr.length;i++) {
            newNode.insertInNull(root, arr[i]);
        }
        newNode.inOrder(root);
        System.out.println();
    }
}
