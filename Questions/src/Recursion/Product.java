// package Recursion;

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
    public static void main(String[]args){
        Product ob=new Product();
        int arr[]={1,2,3,4,5};
        int res=ob.result(arr, arr.length-1);
        System.out.println("Result: "+res);
    }
}
