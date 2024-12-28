package Array;

import java.util.Scanner;

class setZeroAtEnd {
    void result(int arr[], int size) {

        int nonZeroIndex = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the element at nonZeroIndex
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                // Increment the nonZeroIndex
                nonZeroIndex++;
            }
        }
    }
}

public class ZeroatEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        setZeroAtEnd ob = new setZeroAtEnd();
        ob.result(arr, size);
    }
}
