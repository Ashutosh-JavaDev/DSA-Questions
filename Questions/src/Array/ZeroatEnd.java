package Array;

import java.util.Scanner;

class setZeroAtEnd {
    void result(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
            int temp=arr[i];
            if(temp==0){
                System.out.print(temp+" ");
            }
        }
        System.out.println();
    }
}

public class ZeroatEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        setZeroAtEnd ob=new setZeroAtEnd();
        ob.result(arr, size);
    }
}
