package Array;

import java.util.Scanner;

public class BasicClass {
    class basic {
        public void Basic() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Size of the Array");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the Value in the Array");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        }
    }
}
