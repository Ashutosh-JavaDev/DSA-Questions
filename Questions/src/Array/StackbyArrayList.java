package Array;

import java.util.Scanner;
import java.util.ArrayList;

class stackImplementation {
    private int data;
    static ArrayList<Integer> stack = new ArrayList<>();
    int top = -1;

    // static boolean isEmpty(){
    // return stack.size()==0;
    // }
    void push(int data) {
        this.data = data;
        top = top + 1;
        stack.add(top, data);
        System.out.println(data + " is added at " + top + " index");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack UnderFlow,Push Data First");
        } else {
            System.out.println(stack.get(top));
            stack.remove(top);
            top = top - 1;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack UnderFlow,Push Data First");
        } else {
            System.out.println(stack.get(top) + " is in the Top");

        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack UnderFlow,Nothing to Display");
        } else {
            int val = 0;
            while (stack.size() > val) {
                System.out.println(stack.get(val));
                val++;
            }
        }
    }
}

public class StackbyArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackImplementation ob = new stackImplementation();
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
