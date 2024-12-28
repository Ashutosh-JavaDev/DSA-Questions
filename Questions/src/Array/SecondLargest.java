package Array;

import java.util.Scanner;

class secondLargest {
    int Result(int arr[], int size) {
        if (size < 2) {
            System.out.println("Array must have at least two elements.");
            return -1; // Return -1 to indicate an error
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max) {
                secMax = arr[i];
            }
        }

        if (secMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists.");
            return -1; // Return -1 if no second largest element
        }

        System.out.println("Maximum Number: " + max);
        return secMax;
    }
}

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least two elements.");
            return; // Exit the program
        }

        int arr[] = new int[size];
        System.out.println("Enter the Values in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        secondLargest ob = new secondLargest();
        int result = ob.Result(arr, size);

        if (result != -1) { // Only print if a valid second largest element is found
            System.out.println("Second Maximum Number: " + result);
        }
    }
}
