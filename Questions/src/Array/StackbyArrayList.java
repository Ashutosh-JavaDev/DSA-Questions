package Array;

import java.util.Scanner;
import java.util.ArrayList;

class stackImplementation {
    private int data;
    static ArrayList<Integer> stack = new ArrayList<>();
    int top = -1;
   static boolean isEmpty(){
       return stack.size()==0;
    }
    void push(int data) {
        this.data = data;
        if (!isEmpty()) {
            System.out.println("Stack OverFlow");
        } else {
            top=top+1;
            stack.add(top, data);
            System.out.println(data+" is added at "+top+" index");
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow,Push Data First");
        }
        else{
            System.out.println(stack.get(top));
            stack.remove(top);
            top=top-1;
            System.out.println("New Top Data "+stack.get(top));;
        }
    }
    void peek(){
         if(isEmpty()){
            System.out.println("Stack UnderFlow,Push Data First");
        }
        else{
            System.out.println(stack.get(top)+" is in the Top");
        }
    }
}

public class StackbyArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackImplementation ob=new stackImplementation();

    }
}
