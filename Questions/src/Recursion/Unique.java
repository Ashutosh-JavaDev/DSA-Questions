package Recursion;

public class Unique {
    int valuse=0;
    public void check(int arr[], int size,int index) {
        if (size == 0) {
            return;
        }
        if(index==valuse){
            if(arr[size-1]==arr[index]){
                valuse++;
                check(arr, size-1, index+1);
            }
            if(arr[size-1]!=arr[index]){
                System.out.print(arr[size-1]+" ");
                valuse++;
                check(arr, size-1, index+1);
            }
        }
    }
    public static void main(String[]args){
        Unique ob=new Unique();
        int arr[]={1,2,2,3};
        ob.check(arr, arr.length-1, 0);
    }
}
