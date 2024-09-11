package Recursion;

public class FindMaximum {
    int max=0;
    public int maximum(int arr[],int size){
        if(size==0){
            return 0;
        }
        else{
            if(max>arr[size-1]){
                max=arr[size-1];
                maximum(arr, size-1);
            }
            else{
                maximum(arr, size-1);
            }
        }
        return max;
    }
}
