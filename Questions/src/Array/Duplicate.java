package Array;

import java.util.Scanner;

class DUplicate {
    public void Check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
            
        }
        System.out.println();

    }
}

public class Duplicate {

    public static void main(String[] args) {
        DUplicate ob = new DUplicate();
        ob.Check();
    }
}
