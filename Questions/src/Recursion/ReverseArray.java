// package Recursion;

public class ReverseArray {
    public void print(int arr[],int size){
        if(size==0){
            return;
        }
        else{
            System.out.println(arr[size-1]);
            print(arr, size-1);

        }
    }
    public static void main(String[]args){
        ReverseArray ob=new ReverseArray();
        int arr[]={1,2,3,4,5};
        ob.print(arr, arr.length);

    }
}
