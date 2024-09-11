package Recursion;

public class Product {
    int pro=1;
    public int result(int arr[],int size){
        if(size==0){
            return 0;
        }
        else{
            pro*=arr[size-1];
            result(arr, size-1);
        }
        return pro;
    }
}
