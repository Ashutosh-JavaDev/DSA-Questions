package Array;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

// class operation {
// public int InsertAtBeginning(int data) {
// int temp = 0;
// return temp;

// }
// }

public class LinkedListOperation {
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(61);
        Node c=new Node(26);
        Node d=new Node(46);
        Node e=new Node(12);
        a.Display(a);
    }
}
