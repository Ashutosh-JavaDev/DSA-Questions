package Array;

import java.util.Scanner;

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
        while(temp.next!=Head){
            temp=temp.next;
        }
        temp=Head;
        System.out.println(temp+" is the New Top");
    }
    void peek(){
        if(Head==null){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(Head.data+" is in the Top");
        }
    }
    void Display(){
        if(Head==null){
            System.out.println("Stack is Empty,Nothing to Display");
        }
        else{
            
        }
    }
}

public class StackbyLinkedList {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        Nodes ob = new Nodes(0);
        int choice;
        while (1 > 0) {
            System.out.println("Choose\n1.TO Push()\n2.To Pop()\n3.To Peek()\n4.To Display()\n5.To Exit()");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter the data in the list");
                    ob.push(sc.nextInt());
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.peek();
                    break;
                case 4:
                    ob.display();
                    break;
                case 5:
                    return;
                // break;
                default:
                    System.out.println("Choose Wisely");
                    break;
            }
        }
    }
}
