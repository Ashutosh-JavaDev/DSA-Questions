package Recursion;

public class chrckArray {
    boolean result=false;
    // int sorting=0;
    public boolean check(int arr[],int size){
        if(size==0){
            return result;
        }
        else{
            if(arr[size-1]<arr[size-2]){
                check(arr, size-1);
                result=true;

            }
            else{
                result=false;
            }
        }
        return result;
    }
}
