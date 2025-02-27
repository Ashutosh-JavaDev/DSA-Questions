package Array;

import java.util.Scanner;

class quueue {
    Scanner sc=new Scanner(System.in);
    int size = 10;
    int front=-1;
    int rear=-1;
    int queue[] = new int[size];
    void Enqueue(){
        int data;
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
}

public class Quueue {
    public static void main(String[] args) {

    }
}
