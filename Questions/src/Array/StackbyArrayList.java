package Array;

import java.util.Scanner;
import java.util.ArrayList;

class stackImplementation {
    Scanner sc = new Scanner(System.in);
    private int data;
    ArrayList stack=new ArrayList<Integer>();
    int top=-1;
    void push(int data) {
        this.data = data;
        if(top==stack.size()-1){
            System.out.println("Stack OverFlow");
        }
    }
}

public class StackbyArrayList {
    public static void main(String[] args) {

    }
}
