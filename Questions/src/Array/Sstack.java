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
            arr[top] = data;
            System.out.println(data + " is added at the " + top + " index");
        }
    }

    void pop() {
        if (arr[top] == top - 1) {
            System.out.println("Stack UnderFlow");
        } else {
            System.out.println(arr[top] + " Is removed from the stack");
            top--;
        }
    }

    void peek() {
        if (arr[top] == top - 1) {
            System.out.println("Stack UnderFlow");
        } else {
            System.out.println(arr[top] + " Is Peaked from the stack");
        }
    }
}

public class Sstack {
    public static void main(String[]args){
        
    }

}
