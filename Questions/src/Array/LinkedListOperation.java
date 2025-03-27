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

    void create() {
        Node head=null;
        Node tail=null;
        Scanner sc = new Scanner(System.in);
       
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {
        Node x = new Node(0);
        Node.Display(x);
    }
}
