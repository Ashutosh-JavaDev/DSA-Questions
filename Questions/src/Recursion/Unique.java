package Recursion;

public class Unique {
    int valuse=0;
    public void check(int arr[], int size,int index) {
        if (size == 0) {
            return;
        }
        if(index==valuse){
            if(arr[size-1]==arr[index]){
                check(arr, size-1, index);
            }
            if(arr[size-1]!=arr[index]){
                System.out.print(arr[size-1]+" ");
                check(arr, size, index);
            }
        }
    }
}
