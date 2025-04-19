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
    void pop(){
        Nodes temp=null;
        if(Head==null){
            System.out.println("Stack is Empty,Nothing for Delete");
        }
        while(temp!=Head){
            
        }
    }
}

public class StackbyLinkedList {
    public static void main(String[] args) {

    }
}
