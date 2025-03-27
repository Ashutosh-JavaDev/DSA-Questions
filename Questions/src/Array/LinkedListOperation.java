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
        String str;
        while(true){
            str=sc.nextLine();
            if(str.equals(" ")){
                return;
            }
            else{
                try{
                    System.out.println("Enter the value in the List");
                    int data=Integer.parseInt(str);
                    Node a=new Node(data);
                    if(head==null){
                        head=tail=a;
                    }
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
