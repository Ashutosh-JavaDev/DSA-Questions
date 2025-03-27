package Array;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);

    void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void create() {

        String str;
        while (true) {
            str = sc.nextLine();
            if (str.equals(" ")) {
                return;
            } else {
                try {
                    System.out.println("Enter the value in the List");
                    int data = Integer.parseInt(str);
                    Node newN = new Node(data);
                    if (head == null) {
                        head = tail = newN;
                    } else {
                        tail.next = newN;
                        tail = newN;
                    }
                } catch (NumberFormatException e) {
                    e.getMessage();
                }
            }
        }
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {
        Node x = new Node(0);
        Node.Display(x);
    }
}
