package Array;
class stack{
    int size=10;
    int arr[]=new int[size];
    int top=-1;
    void push(){
        int data;
        if(top==size-1){
            System.out.println("Stack Overflow");
        }
        else{
            System.out.println("Enter the value in the Stack");
            data=sc.nextInt();
        }
    }
    void pop(){

    }
    void peek(){

    }
}
public class Sstack {
    
}
