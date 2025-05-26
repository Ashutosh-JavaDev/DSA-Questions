package Tree;
class Nodes{
    Nodes Left;
    Nodes Right;
    int data;
    Nodes(int data){
        this.data=data;
    }
    public static Nodes insertion(Nodes root,int val){
        if(root==null){
            root=new Nodes(val);
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
    public static  void inorder(Nodes root){
        if(root==null){
            return;
        }
        inorder(root.Left);
        System.out.print(root.data+" ");
        inorder(root.Right);
    }
}
public class SearchBst {
    public static void main(String[]args){
        int arr[]={21,23,43,1,2,3,43,238};

        Nodes n=new Nodes(0);
        Nodes root=null;
        for(int i=0;i<arr.length;i++){
            root=n.insertion(root, arr[i]);
        }
        n.inorder(root);
        System.out.println();
    }
}
