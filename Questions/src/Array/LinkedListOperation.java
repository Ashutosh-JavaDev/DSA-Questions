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
        System.out.println("Press Stop to stop otherwise Enter the Value");
        String str;
        while (true) {
            str = sc.nextLine();
            if (str.equalsIgnoreCase("Stop")) {
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

    void InsertInBeginning(int data) {
        Node newN = new Node(data);
        if (head == null) {
            head = tail = newN;
        } else {
            newN.next = head;
            head = newN;
        }
    }

    void InsertInMid(int index, int data) {
        Node newN = new Node(data);
        if (head == null) {
            head = tail = newN;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newN.next = temp.next;
            temp.next = newN;
        }

    }

    void InsertInEnd(int data) {
        Node newN = new Node(data);
        if (head == null) {
            head = tail = newN;
        } else {
            tail.next = newN;
        }
        tail = newN;
    }

    int countLength() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;

            temp = temp.next;
        }

        return count;
    }

    void DeleteFromBeginning() {

        if (head == null) {
            System.out.println("List is Empty, No Data is here to be delete");
        } else {
            head = head.next;
        }
    }

    void DeleteAtEnd() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Empty, No Data is here to be delete");
        } else {
            for (int i = 0; i < countLength() - 1; i++) {
                temp = temp.next;
            }
            temp = null;
            tail = temp;
        }
    }
    void DeleteFromMid(int pos){
        if (head == null) {
            System.out.println("List is Empty, No Data is here to be delete");
        } 
        else{
            System.out.println("Enter the Positon from the data want to be delete...");
            pos=sc.nextInt();
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    void choice() {

        // Scanner sc=new Scanner(System.in);
        System.out.println("Press 1:To Create\nPress 2:To Insert In Beginning");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                create();
                break;
            case 2:
                System.out.println("Your List is Empty,Please Create a List First");
                create();
                System.out.println("Enter the number want to add in the List");
                int num = sc.nextInt();
                InsertInBeginning(num);
                System.out.println("-----------------------------------------------------");
                break;
            default:
                System.out.println("Wrong Choice,Choose Wisely");
                break;
        }
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {
        Node x = new Node(0);
        x.choice();
        x.Display();
    }
}
