package Array;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int InsertAtBeginning(int data) {
        Node head=null;
        Node tail=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the List");
        int size = sc.nextInt();
        Node head;
        Node temp = head;
        while (temp != size) {

        }
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {
        Node x = new Node(0);
        operation ob = new operation();
        ob.InsertAtBeginning(5);
        Node.Display(x);
    }
}
