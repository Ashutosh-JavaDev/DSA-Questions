package Array;

import java.util.Scanner;

public class Duplicate {
    class duplicate {
        public int Check(int arr[], int size) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Size of Array");
            size = sc.nextInt();
            arr = new int[size];
            System.out.println("Enter the Value in the Array");
            for (int i = 0; i < size; i++) {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                    
                }
            }
            int index=arr[0];
            return index;
        }
    }
}
