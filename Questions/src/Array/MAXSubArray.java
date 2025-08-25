package Array;

import java.util.Scanner;

public class MAXSubArray {
    public static int Sum(int[] arr){
        int sum=arr[0];
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=Math.max(arr[i], sum);
            maxSum=Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System,out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res=Sum(arr);
        System.out.println("Max SubArray: "+res);
    }
}
