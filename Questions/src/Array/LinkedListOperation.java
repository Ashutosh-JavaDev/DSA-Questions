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
    }
}
