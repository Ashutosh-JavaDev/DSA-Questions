package Array;

class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
    }

    Nodes Head = null;
    Nodes Tail = null;

    void push(int data) {
        Nodes temp=Head;
        Nodes newN=new Nodes(data);
        if(temp==null){
           temp=Tail=Head;

        }
    }
}

public class StackbyLinkedList {
    public static void main(String[] args) {

    }
}
