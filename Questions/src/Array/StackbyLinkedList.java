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
  
        Nodes newN = new Nodes(data);
        if (Head == null) {
            Head = Tail = newN;
        }
        else{
            Head=Head.next;
            newN.next=Head;
            Head=newN;
        }
    }
}

public class StackbyLinkedList {
    public static void main(String[] args) {

    }
}
