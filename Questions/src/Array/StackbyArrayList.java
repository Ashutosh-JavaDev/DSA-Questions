package Array;

import java.util.Scanner;
import java.util.ArrayList;

class stackImplementation {
    private int data;
    ArrayList stack = new ArrayList<Integer>();
    int top = -1;

    void push(int data) {
        this.data = data;
        if (top == stack.size() - 1) {
            System.out.println("Stack OverFlow");
        } else {
            top=top+1;
            stack.add(data);
            System.out.println(data+" is added at "+top+" index");
        }
    }
}

public class StackbyArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
