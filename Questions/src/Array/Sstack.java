package Array;

import java.util.Scanner;

class stack {
    Scanner sc = new Scanner(System.in);
    int size = 10;
    int arr[] = new int[size];
    int top = -1;

    void push() {
        int data;
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            System.out.println("Enter the value in the Stack");
            data = sc.nextInt();
            top++;
            arr[top]=data;
        }
    }

    void pop() {

    }

    void peek() {

    }
}

public class Sstack {

}
