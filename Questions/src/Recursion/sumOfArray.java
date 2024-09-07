package Recursion;

public class sumOfArray {
//    int arr[];
    int sum=0;
    public int result(int arr[],int size){
        if(size<0){
            return 0;
        }
        else{
            sum+=arr[size-1];
            result(arr, size-1);
        }
        return sum;
    }
    public static void main(String[]args){
        sumOfArray ob=new sumOfArray();
        int arr[]={1,2,3,4,5};
        int res=ob.result(arr, arr.length);
        System.out.println("Result: "+res);
    }
}
