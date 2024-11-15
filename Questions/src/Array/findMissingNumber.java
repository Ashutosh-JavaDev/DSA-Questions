package Array;
import java.util.Scanner;
class MissingNumber{
    public int findNumber(int arr[],int size){
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        for(int i=0;i<size;i++){
            sum-=arr[i];
        }
        return sum;
    }
}
public class findMissingNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        MissingNumber ob=new MissingNumber();
        int res=ob.findNumber(arr, size);
        System.out.println("Result: "+res);
        System.err.println(arr.length);
    }
}
