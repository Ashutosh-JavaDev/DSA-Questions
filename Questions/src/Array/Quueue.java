package Array;

import java.util.Scanner;

class quueue {
    Scanner sc=new Scanner(System.in);
    int size = 10;
    int front=-1;
    int rear=-1;
    int queue[] = new int[size];
    int data;
    void Enqueue(){
        if(front==size-1){
            System.out.println("Queue is Full");
        }
        else{
            rear=rear+1;
            System.out.println("Enter the value in the queue");
            data=sc.nextInt();
            queue[rear]=data;
            System.out.println(data+" is added in the queue");
        }
    }
    void Dequeue(){
        if(front==-1){
            System.out.println("Queue is Empty,first insert the data");
        }
        else{
            System.out.println(queue[front]+" is removed from the queue");
            front=front-1;
        }
    }
}

public class Quueue {
    public static void main(String[] args) {

    }
}
