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

    int InsertInBeginning(int data){
        Node newN=new Node(data);
        head=tail=newN;
        return newN.data;
    }
    int InsertInMid(int data){
        Node newN=new Node(data);
        head.next=newN;
        newN.next=tail;
        return newN.data;
    }

    void choice(){

        // Scanner sc=new Scanner(System.in);
        System.out.println("Press 1:To Create\nPress 2:To Insert In Beginning");
        int choose=sc.nextInt();
        switch(choose){
           case 1:
           create();
           Display();
           break;
           case 2:
           System.out.println("Enter the number want to add in the List");
           int num=sc.nextInt();
           InsertInBeginning(num);
           Display(); 
        }
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {
        Node x = new Node(0);
        x.create();
        System.out.println("Displaying");
        x.Display();
    }
}
